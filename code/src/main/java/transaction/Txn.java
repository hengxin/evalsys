package transaction;

import java.util.List;

public class Txn {
    private long txnId;
    private long rowCnt;//已经执行的行数
    private List<Access> accesses; //事务包括的操作集


    public void setTxnId(long txnId) {
        this.txnId = txnId;
    }

    public long getTxnId() {
        return txnId;
    }


}
