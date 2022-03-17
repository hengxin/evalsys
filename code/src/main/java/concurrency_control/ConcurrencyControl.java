package concurrency_control;

import global.RC;
import transaction.TxnManager;

public interface ConcurrencyControl {
    RC validate(TxnManager txnManager);
}
