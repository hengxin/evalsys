package global;

public enum RC {
    RCOK, //执行成功
    Commit,
    Abort,
    WAIT,
    WAIT_REM, //发送remoteRequest，等待响应
    ERROR,
    FINISH,
    NONE
}
