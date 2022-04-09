# Deneva-java

191250064敬超

# 架构：

- 客户端实例：
  - 事务发起者。客户端中的每个线程负责发起事务请求。
  - 把发起的事务请求放到消息队列，按序发给服务端具体执行（暂不使用消息队列，直接远程调用）
- 服务端实例：
  - 具体执行事务中的各类操作。不同服务端实例中存有数据
  - 一个服务端实例可大致分为4个模块：
    - 通信模块
      - 消息队列：暂存客户端或其他服务端发来的消息
    - 执行模块
      - 分配多个工作线程
        - 对消息队列中的消息进行解析并实际执行（暂时采用远程调用通信，让一个客户端实例发起事务时直接调用启动一个服务端工作线程）
    - 并发控制模块
      - 工作线程在执行事务操作的过程中，要维护特定并发控制协议要求的信息，并执行协议规定的流程
    - 数据存储模块
      - 负责管理本实例中的数据，将数据都存在内存中
- 客户端和服务端实例是全连接的拓扑结构，部署在不同的机器上。



## 事务执行流程（直接远程调用）：

- 客户端发起一个事务请求（由多个操作组成），并通过远程调用一个服务端实例的工作线程处理该事务请求。
  - 是否需要一个中间人来进行通信/还是客户端直接调服务端？
- 当某一工作线程处理当前事务的操作时，其首先对事务进行初始化，然后按顺序执行读写操作，并最终提交或回滚
- 并发控制协议所要求的额外操作嵌入事务的执行过程中，包括读写操作，验证操作，提交/回滚操作等
- 通知客户端当前事务的执行结果

# Coordinator

- 如何确定coordinator？
  - client发起远程调用，被调用的方法将创建n个线程，在每个线程中再分别调用各个服务端实例中的一个workerThread的run方法（服务端被调用相当于接受到prepare信号）
  - 第一个线程会作为coordinator，将调用coordinator的run方法，但要使用countdownlatch，让它等待shard线程全部执行结束后再run（等待shard计算投票结果）
- client远程调用请求的结构及返回结构：
  - 请求结构需要包含：一次事务的完整信息
  - 返回结构：一个执行结果

- 实现的功能：
  - 处理各个shard传来的pre_ack请求（rpc调用）
    - 第一个接受到client端传来的prepare信号的shard作为coordinator？
    - 一个shard就是一个服务端实例
    - coordinator使用countdownlatch等待其他所有shard提交完结果==或==远程调用
    - 远程调用的实现方式？
      - 
  - 把结果传回各个shard以及client

## 问题：

- ##### 一个shard就是一个服务端实例吗？

- ##### coordinator如何获取到shard的投票结果呢？

  - coordinator作为主线程
    - client的事务请求先发给一个shard，该shard作为coordinator，由该coordinator再去调用其他shard处理该事务，并接受各个shard的结果
  - 没有主线程
    - client事务请求发给所有shard，第一个shard依然作为coordinator，但不由它调用其他shard处理事务。且coordinator需要等待shard先执行
    - 两种通信方式：
      - 能否有一个公共的队列来暂存各个shard的投票结果，最后由coordinator从该队列中取出结果进行验证？（不知道怎么实现让多个服务器共享一个公共队列）
      - 由各个shard在计算出投票后，coordinator再调用各个shard，拿到各个shard的投票结果

- ##### 使用countdownlatch可以实现让一个线程等待其他线程执行完毕，但能否实现coordinator等待其他shard投完票呢，考虑到不同shard是在不同的服务器上？（如果不用这个该如何设计？）

  - 因为shard可能是在不同的服务器上
  - 我的想法：
    - 应该有一个类来负责客户端和服务端之间的通信
    - 该类接受到来自客户端的事务请求后，起多个线程，每个线程都远程调用一个shard的run方法（相当于shard收到prepare信号),在该类起多个线程时，让第一个线程（作为coordinator）等待其他线程的执行结果
    - 每个run方法将最终提交该shard对该事务的结果（提交，放弃等）

- ##### 如果直接采用远程调用的方式，感觉就不需要message了？

### 远程调用过程：

- ##### 想法1:

  - client向msgService发送调用请求

    - request中包含一次完整的事务
    - 返回是事务执行结果

  - 由msgService中的sendPrepareMsg代替client执行发送prepare信号的过程

    - ##### 想法1:

      - 在msgService中启用多个线程，每个线程远程调用不同shard计算对当前事务的投票结果，最后调用一个线程远程调用coordinator的方法综合投票结果作出决策（countdownlatch）

        - ```java
          final CountDownLatch countDownLatch = new CountDownLatch(threadCount);
          for(int i=0;i<=threadCount;i++){
                  Thread thread = new Thread(new Runnable() {
          	@Override
          	public void run() {
              远程调用shard
              countDownLatch.countDown();
          });
          thread.start();
          }
          
          countDownLatch.await();
          远程调用coordinator                                  
                                             
          ```

          

      - 问题是coordinator如何拿到其他shard的投票？

        - shard计算之后把投票结果存在本地，coordinator再通过远程调用拿到结果，拿到后计算出最终结果，并作为client调用msgService的返回结果
        - 或者是msgService中可以存储每个shard返回的投票结果，在调用coordinator时直接拿msgService中存储的结果来计算

    - ##### 想法2:

      - 在msgService中直接远程调用cordinator，在coordinator中再调用各个shard，各个shard直接返回投票结果给coordinator，coordinator计算最终结果

- ##### 想法3:

  - 在msgService中sendPrepareMsg远程调用shard。

  - 每个shard在计算完投票结果后，再调用coordinator（怎么知道谁是coordinator）存储投票结果

  - coordinator如果收集到一定数量(?)的投票，就开始计算最终结果，最后再由coordinator调用client（反馈结果）和shard（根据决策执行事务）

    - ```java
      if(收集到一定数量的投票){
        计算结果
        远程调用client，shard
      }else{
        存储投票
      }
      ```

      