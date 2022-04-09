package transaction;

import client.BaseQuery;
import concurrency_control.OCC;
import conf.Config;
import global.RC;

import java.util.HashSet;
import java.util.List;

/**
 * 对一个事务进行管理
 */
public class TxnManager {
    private Txn txn;
    private Thread thd;
    private int responseCount;
    private BaseQuery baseQuery;

    public void setTxnId(long txnid) {
        txn.setTxnId(txnid);
    }

    public void registerThread(Thread thd){
        this.thd = thd;
    }

    public RC validate() {
        RC rc = RC.RCOK;
        //除OCC外的其他协议在prepare阶段都返回Commit，只有OCC需要在此阶段进行验证
        if (Config.CC_ALG == Config.OCC){
            OCC occ = new OCC();
            rc = occ.validate(this);
        }
        return rc;
    }


    //中止事务
    public void abort() {

    }

    //提交事务
    public void commit() {

    }

    //执行事务
    public void runTxn() {

    }

    //txnManager收到回复
    public int receivedResponse(RC rc){
        assert (this.txn.getRc()==RC.RCOK||this.txn.getRc()==RC.Abort);
        if(this.txn.getRc()==RC.RCOK){//当前事务执行成功
            this.txn.setRc(rc);
        }
        this.responseCount--;
        return this.responseCount;
    }

    public void sendFinishMessages(){

        //Todo
//        rsp_cnt = query->partitions_touched.size() - 1;
//        assert(IS_LOCAL(get_txn_id()));
//        DEBUG("%ld Send FINISH messages to %d\n",get_txn_id(),rsp_cnt);
//        for(uint64_t i = 0; i < query->partitions_touched.size(); i++) {
//            if(GET_NODE_ID(query->partitions_touched[i]) == g_node_id) {
//                continue;
//            }
//            msg_queue.enqueue(get_thd_id(),Message::create_message(this,RFIN),GET_NODE_ID(query->partitions_touched[i]));
//        }

        responseCount = baseQuery.getPartitionsTouched().size()-1;
        for (long i = 0;i<baseQuery.getPartitionsTouched().size();i++){

        }
    }


    public Txn getTxn() {
        return txn;
    }

    public void setTxn(Txn txn) {
        this.txn = txn;
    }

    public Thread getThd() {
        return thd;
    }

    public void setThd(Thread thd) {
        this.thd = thd;
    }

    public int getResponseCount() {
        return responseCount;
    }

    public void setResponseCount(int responseCount) {
        this.responseCount = responseCount;
    }
}
