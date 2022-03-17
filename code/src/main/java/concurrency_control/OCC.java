package concurrency_control;
import global.RC;
import transaction.TxnManager;


public class OCC implements ConcurrencyControl{


    @Override
    public RC validate(TxnManager txnManager) {

        return RC.RCOK;
    }

}
