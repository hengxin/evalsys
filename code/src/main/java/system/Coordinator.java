package system;

import global.RC;
import transport.AckMessage;
import transport.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Coordinator extends WorkerThread{

    //存储各个shard的投票结果
    private BlockingQueue<RC> rcQueue;

    public Coordinator(BlockingQueue<Message> queue) {
        super(queue);
        this.rcQueue = new LinkedBlockingQueue<>();
    }




    @Override
    public void process(Message msg) {
        myProcessPrepareACK();
        //processPrepareACK((AckMessage) msg);
    }

    private RC myProcessPrepareACK(){
        //等待各个分区提交结果

        //rcList就绪，开始处理结果


        //返回结果给各个shard及client
        return null;
    }
//      //处理prepare_ack
//    private RC processPrepareACK(AckMessage msg){
//        RC rc = RC.RCOK;
//        //int responses_left = txn_man->received_response(((AckMessage*)msg)->rc);
//        int responseLeft = this.txnManager.receivedResponse(msg.getRc());
//        assert (responseLeft>=0);
//        if(false){
//            //MAAT
//        }
//
//        //还有未接收的msg（Coordinator要等收到所有shard的ack信号才会进行计算）
//        if(responseLeft > 0) {
//            return RC.WAIT;
//        }
//
//        //
//        if(txnManager.getTxn().getRc() == RC.RCOK) {
//            rc  = txnManager.validate();//
//        }
//        if(rc == RC.Abort || txnManager.getTxn().getRc() == RC.Abort) {
//            //上一步的验证结果为Abort或某个分区执行事务的结果为abort
//            txnManager.getTxn().setRc(RC.Abort);
//            rc = RC.Abort;
//        }
//        //把完成的结果放入msg队列
//        txnManager.sendFinishMessages();
//        if(rc == RC.Abort) {
//            txnManager.abort();
//        } else {
//            txnManager.commit();
//        }
//
//        return rc;
//    }
}
