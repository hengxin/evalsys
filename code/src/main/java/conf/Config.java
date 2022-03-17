package conf;


public class Config {
    //Concurrency_control
    public static int NO_WAIT = 1;
    public static int WAIT_DIE = 2;
    public static int DL_DETECT = 3;
    public static int TIMESTAMP = 4;
    public static int MVCC = 5;
    public static int HSTORE = 6;
    public static int HSTORE_SPEC = 7;
    public static int OCC = 8;
    public static int VLL = 9;
    public static int CALVIN = 10;
    public static int MAAT = 11;
    public static int WDL = 12;

    //设置默认CC为OCC
    public static int CC_ALG = OCC;

    //配置
    public static int SERVER_NODE_CNT = 4;
    public static int CLIENT_NODE_CNT = 4;
    public static int SERVER_THREAD_CNT = 4;
    public static int CLIENT_THREAD_CNT = 4;
    public static int Core_CNT = 4;
    public static int REPLICA_CNT = 0;

}
