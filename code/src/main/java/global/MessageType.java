package global;

public enum MessageType {
    CL_QRY,//客户端发送请求
    CL_RSP,//回复client请求
    QRY,//执行事务
    QRY_RSP,//收到事务远程分区的返回结果
    PREPARE,//PREPARE阶段
    ACK_PREP,//统计投票结果
    ACK_FIN,//coordinator统计事务提交的结果，COMMIT：将结果返回client，ABORT：将事务加入abort queue
    FIN,//Commit事务 or Abort事务
}
