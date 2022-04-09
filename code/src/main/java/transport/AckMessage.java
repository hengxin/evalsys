package transport;

import global.RC;

public class AckMessage extends Message{
    private RC rc;

    public AckMessage(){

    }

    public RC getRc() {
        return rc;
    }

    public void setRc(RC rc) {
        this.rc = rc;
    }
}
