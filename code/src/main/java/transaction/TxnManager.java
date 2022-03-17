package transaction;

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
    private RC rc;

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

    public void setRC(RC rc) {
        this.rc = rc;
    }
}
