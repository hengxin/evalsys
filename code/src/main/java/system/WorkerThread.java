package system;

import conf.Global;
import global.MessageType;
import global.RC;
import transaction.TxnManager;
import transaction.TxnTable;
import transport.Message;

import java.util.concurrent.BlockingQueue;

public class WorkerThread extends ThreadImpl {

    protected RC rc;
    protected TxnManager txnManager;
    protected BlockingQueue<Message> queue;

    protected long thdTxnId = 0;//

    public WorkerThread(BlockingQueue<Message> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){//要改
            Message msg = queue.poll();
            process(msg);
        }
    }

    public void process(Message msg) {
        MessageType type = msg.getType();//消息类型
        switch (type) {
            case CL_QRY://client端请求
                rc = processTxn(msg);
                break;
            case QRY_RSP: //收到事务远程分区的返回结果
                rc = processQryRsp(msg);
                break;
            case PREPARE:
                rc = prepare(msg);
                break;
            case ACK_PREP: //coordinator收集投票
                rc = prepareAck(msg);
                break;
            case FIN: //收到Decision后决定提交or回滚
                rc = decision(msg);
                break;
            
        }
    }

    private RC processQryRsp(Message msg) {
        return  null;
    }

    private RC processTxn(Message msg) {
        //初始化事务id（唯一）
        long txnId = getNextTxnId();
        msg.setTxnId(txnId);
        //获取txn的TxnManager
        txnManager = TxnTable.getTxnTable().getTxnManager(txnId);
        txnManager.registerThread(this);
        //执行事务
        txnManager.runTxn();
        return  null;
    }

    private long getNextTxnId() {
        long txnId = ( this.getNodeId() + this.getThreadId() * Global.NODE_COUNT)
                + (Global.THREAD_CNT * Global.NODE_COUNT * thdTxnId);//事务id的计算方法
        ++thdTxnId;
        return txnId;
    }

    public RC prepare(Message msg) {
        rc = txnManager.validate(); //验证
        //txnManager.setRC(rc);
        //消息发送
        return  null;
    }

    private RC prepareAck(Message msg) {
        return null;
    }

    private RC decision(Message msg) {
        return null;
    }

}
