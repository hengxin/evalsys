package transport;

import global.RC;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;


public class PrepareMsgService {

    private Server server;

    /**
     * 对外暴露服务
     **/
    private void start() throws IOException {
        int port = 50051;
        server = ServerBuilder.forPort(port)
                .addService(new PrepareMsgServiceImpl())
                .build()
                .start();
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                PrepareMsgService.this.stop();
            }
        });
    }

    /**
     * 关闭端口
     **/
    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * 优雅关闭
     **/
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }


    public static void main(String[] args) throws IOException, InterruptedException {
        final PrepareMsgService server = new PrepareMsgService();
        server.start();
        server.blockUntilShutdown();
    }

}