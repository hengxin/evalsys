package system;

public class ThreadImpl extends Thread{
    private long threadId;
    private long nodeId;

    public long getThreadId(){
        return threadId;
    }

    public long getNodeId(){
        return  nodeId ;
    }
}
