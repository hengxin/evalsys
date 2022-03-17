package transaction;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TxnTable {
    private volatile static TxnTable txnTable;
    private Map<Long, TxnManager> map = new ConcurrentHashMap<>();//key:txn_id
    private TxnTable(){}

    /**
     * 单例模式创建对象，全局一份
     * @return
     */
    public static TxnTable getTxnTable(){
        if (txnTable == null){
            synchronized (TxnTable.class){
                if (txnTable == null){
                    txnTable = new TxnTable();
                }
            }
        }
        return txnTable;
    }

    public void setTxnTable(long txnId, TxnManager txnManager){
        map.put(txnId,txnManager);
    }

    //根据事务id获取TxnManager
    public TxnManager getTxnManager(long txnId){
        //若是新事务，为事务创建一个TxnManager
        if (!map.containsKey(txnId)){
            TxnManager txnManager = new TxnManager();
            txnManager.setTxnId(txnId);
            map.put(txnId,txnManager);
        }
        return map.get(txnId);
    }
}
