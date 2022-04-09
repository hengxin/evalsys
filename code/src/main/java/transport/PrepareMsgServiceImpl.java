package transport;

import global.RC;
import io.grpc.prepare.PrepareMsgServiceGrpc;
import io.grpc.prepare.PrepareRequest;
import io.grpc.prepare.Reply;
import io.grpc.stub.StreamObserver;

public class PrepareMsgServiceImpl extends PrepareMsgServiceGrpc.PrepareMsgServiceImplBase {
    @Override
    public void sendPrepareMsg(PrepareRequest request, StreamObserver<Reply> responseObserver) {
        System.out.println("sendPrepareMsg");
        long txnId = request.getTxnId();
        Reply reply = Reply.newBuilder().setMsg("OK:"+txnId).build();
        System.out.println("reply:"+reply);
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
