package client;

import java.util.HashMap;

public class ClientQueryQueue {
    private HashMap<Integer,HashMap<Integer,BaseQuery>> queries;//<serverid,<queryid,BaseQuery>>
    private long queryCnt;
    private long nextTxnid;
    private long size;

}
