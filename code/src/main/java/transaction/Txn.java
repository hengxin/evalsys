package transaction;

import global.RC;

import java.util.List;

public class Txn {
    private long txnId;
    private long rowCnt;//已经执行的行数
    private List<Access> accesses; //事务包括的操作集
    private RC rc;//事务状态


    public void setTxnId(long txnId) {
        this.txnId = txnId;
    }

    public long getTxnId() {
        return txnId;
    }

    public long getRowCnt() {
        return rowCnt;
    }

    public void setRowCnt(long rowCnt) {
        this.rowCnt = rowCnt;
    }

    public List<Access> getAccesses() {
        return accesses;
    }

    public void setAccesses(List<Access> accesses) {
        this.accesses = accesses;
    }

    public RC getRc() {
        return rc;
    }

    public void setRc(RC rc) {
        this.rc = rc;
    }
}
