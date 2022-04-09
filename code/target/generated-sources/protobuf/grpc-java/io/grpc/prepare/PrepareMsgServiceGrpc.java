package io.grpc.prepare;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.1)",
    comments = "Source: prepareMessage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PrepareMsgServiceGrpc {

  private PrepareMsgServiceGrpc() {}

  public static final String SERVICE_NAME = "rpgc.PrepareMsgService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.prepare.PrepareRequest,
      io.grpc.prepare.Reply> getSendPrepareMsgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendPrepareMsg",
      requestType = io.grpc.prepare.PrepareRequest.class,
      responseType = io.grpc.prepare.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.prepare.PrepareRequest,
      io.grpc.prepare.Reply> getSendPrepareMsgMethod() {
    io.grpc.MethodDescriptor<io.grpc.prepare.PrepareRequest, io.grpc.prepare.Reply> getSendPrepareMsgMethod;
    if ((getSendPrepareMsgMethod = PrepareMsgServiceGrpc.getSendPrepareMsgMethod) == null) {
      synchronized (PrepareMsgServiceGrpc.class) {
        if ((getSendPrepareMsgMethod = PrepareMsgServiceGrpc.getSendPrepareMsgMethod) == null) {
          PrepareMsgServiceGrpc.getSendPrepareMsgMethod = getSendPrepareMsgMethod =
              io.grpc.MethodDescriptor.<io.grpc.prepare.PrepareRequest, io.grpc.prepare.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendPrepareMsg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.prepare.PrepareRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.prepare.Reply.getDefaultInstance()))
              .setSchemaDescriptor(new PrepareMsgServiceMethodDescriptorSupplier("sendPrepareMsg"))
              .build();
        }
      }
    }
    return getSendPrepareMsgMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrepareMsgServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrepareMsgServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrepareMsgServiceStub>() {
        @java.lang.Override
        public PrepareMsgServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrepareMsgServiceStub(channel, callOptions);
        }
      };
    return PrepareMsgServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrepareMsgServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrepareMsgServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrepareMsgServiceBlockingStub>() {
        @java.lang.Override
        public PrepareMsgServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrepareMsgServiceBlockingStub(channel, callOptions);
        }
      };
    return PrepareMsgServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrepareMsgServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrepareMsgServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrepareMsgServiceFutureStub>() {
        @java.lang.Override
        public PrepareMsgServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrepareMsgServiceFutureStub(channel, callOptions);
        }
      };
    return PrepareMsgServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PrepareMsgServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendPrepareMsg(io.grpc.prepare.PrepareRequest request,
        io.grpc.stub.StreamObserver<io.grpc.prepare.Reply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendPrepareMsgMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendPrepareMsgMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.prepare.PrepareRequest,
                io.grpc.prepare.Reply>(
                  this, METHODID_SEND_PREPARE_MSG)))
          .build();
    }
  }

  /**
   */
  public static final class PrepareMsgServiceStub extends io.grpc.stub.AbstractAsyncStub<PrepareMsgServiceStub> {
    private PrepareMsgServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrepareMsgServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrepareMsgServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendPrepareMsg(io.grpc.prepare.PrepareRequest request,
        io.grpc.stub.StreamObserver<io.grpc.prepare.Reply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendPrepareMsgMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PrepareMsgServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PrepareMsgServiceBlockingStub> {
    private PrepareMsgServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrepareMsgServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrepareMsgServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.prepare.Reply sendPrepareMsg(io.grpc.prepare.PrepareRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendPrepareMsgMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PrepareMsgServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PrepareMsgServiceFutureStub> {
    private PrepareMsgServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrepareMsgServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrepareMsgServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.prepare.Reply> sendPrepareMsg(
        io.grpc.prepare.PrepareRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendPrepareMsgMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_PREPARE_MSG = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PrepareMsgServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PrepareMsgServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_PREPARE_MSG:
          serviceImpl.sendPrepareMsg((io.grpc.prepare.PrepareRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.prepare.Reply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PrepareMsgServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrepareMsgServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.prepare.prepareMsgProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PrepareMsgService");
    }
  }

  private static final class PrepareMsgServiceFileDescriptorSupplier
      extends PrepareMsgServiceBaseDescriptorSupplier {
    PrepareMsgServiceFileDescriptorSupplier() {}
  }

  private static final class PrepareMsgServiceMethodDescriptorSupplier
      extends PrepareMsgServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PrepareMsgServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PrepareMsgServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrepareMsgServiceFileDescriptorSupplier())
              .addMethod(getSendPrepareMsgMethod())
              .build();
        }
      }
    }
    return result;
  }
}
