
package client;

import global.RC;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.prepare.PrepareMsgServiceGrpc;
import io.grpc.prepare.PrepareRequest;
import io.grpc.prepare.Reply;


import java.util.concurrent.TimeUnit;

public class Client {

    private final ManagedChannel channel;
    private final PrepareMsgServiceGrpc.PrepareMsgServiceBlockingStub blockingStub;
    //private final HelloServiceGrpc.HelloServiceBlockingStub blockingStub;
    /**
     * 构建Channel连接
     **/
    public Client(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build());
    }

    /**
     * 构建Stub用于发请求
     **/
    Client(ManagedChannel channel) {
        this.channel = channel;
        blockingStub = PrepareMsgServiceGrpc.newBlockingStub(channel);
    }

    /**
     * 调用完手动关闭
     **/
    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }


    /**
     * 发送rpc请求
     **/
    public void sendPrepareMsg(String name) {
        // 构建入参对象
        PrepareRequest request = PrepareRequest.newBuilder().setTxnId(1).build();
        Reply response;
        try {
            // 发送请求
            response = blockingStub.sendPrepareMsg(request);
        } catch (StatusRuntimeException e) {
            System.out.println("error");
            return;
        }
        System.out.println(response);
        System.err.println("end");
    }

    public static void main(String[] args) throws Exception {
        Client client = new Client("127.0.0.1", 50051);
        try {
            client.sendPrepareMsg("hello");
        } finally {
            client.shutdown();
        }
    }
}