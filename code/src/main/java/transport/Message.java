package transport;

import global.MessageType;

public class Message {
    private String threadId;
    private String nodeId;
    private long txnId;//事务id
    private MessageType type;//消息类型
    private long returnNodeId;//当前的node_id

    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public long getTxnId() {
        return txnId;
    }

    public void setTxnId(long txnId) {
        this.txnId = txnId;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public long getReturnNodeId() {
        return returnNodeId;
    }

    public void setReturnNodeId(long returnNodeId) {
        this.returnNodeId = returnNodeId;
    }
}
