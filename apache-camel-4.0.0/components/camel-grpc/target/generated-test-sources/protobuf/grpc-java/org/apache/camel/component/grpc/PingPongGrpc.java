package org.apache.camel.component.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The PingPong service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: pingpong.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PingPongGrpc {

  private PingPongGrpc() {}

  public static final java.lang.String SERVICE_NAME = "org.apache.camel.component.grpc.test.PingPong";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.apache.camel.component.grpc.PingRequest,
      org.apache.camel.component.grpc.PongResponse> getPingSyncSyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PingSyncSync",
      requestType = org.apache.camel.component.grpc.PingRequest.class,
      responseType = org.apache.camel.component.grpc.PongResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.camel.component.grpc.PingRequest,
      org.apache.camel.component.grpc.PongResponse> getPingSyncSyncMethod() {
    io.grpc.MethodDescriptor<org.apache.camel.component.grpc.PingRequest, org.apache.camel.component.grpc.PongResponse> getPingSyncSyncMethod;
    if ((getPingSyncSyncMethod = PingPongGrpc.getPingSyncSyncMethod) == null) {
      synchronized (PingPongGrpc.class) {
        if ((getPingSyncSyncMethod = PingPongGrpc.getPingSyncSyncMethod) == null) {
          PingPongGrpc.getPingSyncSyncMethod = getPingSyncSyncMethod =
              io.grpc.MethodDescriptor.<org.apache.camel.component.grpc.PingRequest, org.apache.camel.component.grpc.PongResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PingSyncSync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.camel.component.grpc.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.camel.component.grpc.PongResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PingPongMethodDescriptorSupplier("PingSyncSync"))
              .build();
        }
      }
    }
    return getPingSyncSyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.camel.component.grpc.PingRequest,
      org.apache.camel.component.grpc.PongResponse> getPingSyncAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PingSyncAsync",
      requestType = org.apache.camel.component.grpc.PingRequest.class,
      responseType = org.apache.camel.component.grpc.PongResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.apache.camel.component.grpc.PingRequest,
      org.apache.camel.component.grpc.PongResponse> getPingSyncAsyncMethod() {
    io.grpc.MethodDescriptor<org.apache.camel.component.grpc.PingRequest, org.apache.camel.component.grpc.PongResponse> getPingSyncAsyncMethod;
    if ((getPingSyncAsyncMethod = PingPongGrpc.getPingSyncAsyncMethod) == null) {
      synchronized (PingPongGrpc.class) {
        if ((getPingSyncAsyncMethod = PingPongGrpc.getPingSyncAsyncMethod) == null) {
          PingPongGrpc.getPingSyncAsyncMethod = getPingSyncAsyncMethod =
              io.grpc.MethodDescriptor.<org.apache.camel.component.grpc.PingRequest, org.apache.camel.component.grpc.PongResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PingSyncAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.camel.component.grpc.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.camel.component.grpc.PongResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PingPongMethodDescriptorSupplier("PingSyncAsync"))
              .build();
        }
      }
    }
    return getPingSyncAsyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.camel.component.grpc.PingRequest,
      org.apache.camel.component.grpc.PongResponse> getPingAsyncSyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PingAsyncSync",
      requestType = org.apache.camel.component.grpc.PingRequest.class,
      responseType = org.apache.camel.component.grpc.PongResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.apache.camel.component.grpc.PingRequest,
      org.apache.camel.component.grpc.PongResponse> getPingAsyncSyncMethod() {
    io.grpc.MethodDescriptor<org.apache.camel.component.grpc.PingRequest, org.apache.camel.component.grpc.PongResponse> getPingAsyncSyncMethod;
    if ((getPingAsyncSyncMethod = PingPongGrpc.getPingAsyncSyncMethod) == null) {
      synchronized (PingPongGrpc.class) {
        if ((getPingAsyncSyncMethod = PingPongGrpc.getPingAsyncSyncMethod) == null) {
          PingPongGrpc.getPingAsyncSyncMethod = getPingAsyncSyncMethod =
              io.grpc.MethodDescriptor.<org.apache.camel.component.grpc.PingRequest, org.apache.camel.component.grpc.PongResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PingAsyncSync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.camel.component.grpc.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.camel.component.grpc.PongResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PingPongMethodDescriptorSupplier("PingAsyncSync"))
              .build();
        }
      }
    }
    return getPingAsyncSyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.camel.component.grpc.PingRequest,
      org.apache.camel.component.grpc.PongResponse> getPingAsyncAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PingAsyncAsync",
      requestType = org.apache.camel.component.grpc.PingRequest.class,
      responseType = org.apache.camel.component.grpc.PongResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.apache.camel.component.grpc.PingRequest,
      org.apache.camel.component.grpc.PongResponse> getPingAsyncAsyncMethod() {
    io.grpc.MethodDescriptor<org.apache.camel.component.grpc.PingRequest, org.apache.camel.component.grpc.PongResponse> getPingAsyncAsyncMethod;
    if ((getPingAsyncAsyncMethod = PingPongGrpc.getPingAsyncAsyncMethod) == null) {
      synchronized (PingPongGrpc.class) {
        if ((getPingAsyncAsyncMethod = PingPongGrpc.getPingAsyncAsyncMethod) == null) {
          PingPongGrpc.getPingAsyncAsyncMethod = getPingAsyncAsyncMethod =
              io.grpc.MethodDescriptor.<org.apache.camel.component.grpc.PingRequest, org.apache.camel.component.grpc.PongResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PingAsyncAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.camel.component.grpc.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.camel.component.grpc.PongResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PingPongMethodDescriptorSupplier("PingAsyncAsync"))
              .build();
        }
      }
    }
    return getPingAsyncAsyncMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PingPongStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PingPongStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PingPongStub>() {
        @java.lang.Override
        public PingPongStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PingPongStub(channel, callOptions);
        }
      };
    return PingPongStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PingPongBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PingPongBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PingPongBlockingStub>() {
        @java.lang.Override
        public PingPongBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PingPongBlockingStub(channel, callOptions);
        }
      };
    return PingPongBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PingPongFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PingPongFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PingPongFutureStub>() {
        @java.lang.Override
        public PingPongFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PingPongFutureStub(channel, callOptions);
        }
      };
    return PingPongFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The PingPong service definition.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Sending ping message and getting pong answer synchronously
     * </pre>
     */
    default void pingSyncSync(org.apache.camel.component.grpc.PingRequest request,
        io.grpc.stub.StreamObserver<org.apache.camel.component.grpc.PongResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingSyncSyncMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sending ping message synchronously and getting pong answer asynchronously in streaming mode (multiple response messages)
     * </pre>
     */
    default void pingSyncAsync(org.apache.camel.component.grpc.PingRequest request,
        io.grpc.stub.StreamObserver<org.apache.camel.component.grpc.PongResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingSyncAsyncMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sending ping message asynchronously and getting pong answer synchronously
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.apache.camel.component.grpc.PingRequest> pingAsyncSync(
        io.grpc.stub.StreamObserver<org.apache.camel.component.grpc.PongResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getPingAsyncSyncMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sending ping message asynchronously and getting pong answer asynchronously in streaming mode (multiple response messages)
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.apache.camel.component.grpc.PingRequest> pingAsyncAsync(
        io.grpc.stub.StreamObserver<org.apache.camel.component.grpc.PongResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getPingAsyncAsyncMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PingPong.
   * <pre>
   * The PingPong service definition.
   * </pre>
   */
  public static abstract class PingPongImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PingPongGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PingPong.
   * <pre>
   * The PingPong service definition.
   * </pre>
   */
  public static final class PingPongStub
      extends io.grpc.stub.AbstractAsyncStub<PingPongStub> {
    private PingPongStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingPongStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PingPongStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sending ping message and getting pong answer synchronously
     * </pre>
     */
    public void pingSyncSync(org.apache.camel.component.grpc.PingRequest request,
        io.grpc.stub.StreamObserver<org.apache.camel.component.grpc.PongResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingSyncSyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sending ping message synchronously and getting pong answer asynchronously in streaming mode (multiple response messages)
     * </pre>
     */
    public void pingSyncAsync(org.apache.camel.component.grpc.PingRequest request,
        io.grpc.stub.StreamObserver<org.apache.camel.component.grpc.PongResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getPingSyncAsyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sending ping message asynchronously and getting pong answer synchronously
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.apache.camel.component.grpc.PingRequest> pingAsyncSync(
        io.grpc.stub.StreamObserver<org.apache.camel.component.grpc.PongResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getPingAsyncSyncMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Sending ping message asynchronously and getting pong answer asynchronously in streaming mode (multiple response messages)
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.apache.camel.component.grpc.PingRequest> pingAsyncAsync(
        io.grpc.stub.StreamObserver<org.apache.camel.component.grpc.PongResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getPingAsyncAsyncMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PingPong.
   * <pre>
   * The PingPong service definition.
   * </pre>
   */
  public static final class PingPongBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PingPongBlockingStub> {
    private PingPongBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingPongBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PingPongBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sending ping message and getting pong answer synchronously
     * </pre>
     */
    public org.apache.camel.component.grpc.PongResponse pingSyncSync(org.apache.camel.component.grpc.PingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingSyncSyncMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sending ping message synchronously and getting pong answer asynchronously in streaming mode (multiple response messages)
     * </pre>
     */
    public java.util.Iterator<org.apache.camel.component.grpc.PongResponse> pingSyncAsync(
        org.apache.camel.component.grpc.PingRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getPingSyncAsyncMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PingPong.
   * <pre>
   * The PingPong service definition.
   * </pre>
   */
  public static final class PingPongFutureStub
      extends io.grpc.stub.AbstractFutureStub<PingPongFutureStub> {
    private PingPongFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingPongFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PingPongFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sending ping message and getting pong answer synchronously
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.camel.component.grpc.PongResponse> pingSyncSync(
        org.apache.camel.component.grpc.PingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingSyncSyncMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING_SYNC_SYNC = 0;
  private static final int METHODID_PING_SYNC_ASYNC = 1;
  private static final int METHODID_PING_ASYNC_SYNC = 2;
  private static final int METHODID_PING_ASYNC_ASYNC = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING_SYNC_SYNC:
          serviceImpl.pingSyncSync((org.apache.camel.component.grpc.PingRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.camel.component.grpc.PongResponse>) responseObserver);
          break;
        case METHODID_PING_SYNC_ASYNC:
          serviceImpl.pingSyncAsync((org.apache.camel.component.grpc.PingRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.camel.component.grpc.PongResponse>) responseObserver);
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
        case METHODID_PING_ASYNC_SYNC:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.pingAsyncSync(
              (io.grpc.stub.StreamObserver<org.apache.camel.component.grpc.PongResponse>) responseObserver);
        case METHODID_PING_ASYNC_ASYNC:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.pingAsyncAsync(
              (io.grpc.stub.StreamObserver<org.apache.camel.component.grpc.PongResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getPingSyncSyncMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.apache.camel.component.grpc.PingRequest,
              org.apache.camel.component.grpc.PongResponse>(
                service, METHODID_PING_SYNC_SYNC)))
        .addMethod(
          getPingSyncAsyncMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              org.apache.camel.component.grpc.PingRequest,
              org.apache.camel.component.grpc.PongResponse>(
                service, METHODID_PING_SYNC_ASYNC)))
        .addMethod(
          getPingAsyncSyncMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              org.apache.camel.component.grpc.PingRequest,
              org.apache.camel.component.grpc.PongResponse>(
                service, METHODID_PING_ASYNC_SYNC)))
        .addMethod(
          getPingAsyncAsyncMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.apache.camel.component.grpc.PingRequest,
              org.apache.camel.component.grpc.PongResponse>(
                service, METHODID_PING_ASYNC_ASYNC)))
        .build();
  }

  private static abstract class PingPongBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PingPongBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.camel.component.grpc.PingPongProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PingPong");
    }
  }

  private static final class PingPongFileDescriptorSupplier
      extends PingPongBaseDescriptorSupplier {
    PingPongFileDescriptorSupplier() {}
  }

  private static final class PingPongMethodDescriptorSupplier
      extends PingPongBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PingPongMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PingPongGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PingPongFileDescriptorSupplier())
              .addMethod(getPingSyncSyncMethod())
              .addMethod(getPingSyncAsyncMethod())
              .addMethod(getPingAsyncSyncMethod())
              .addMethod(getPingAsyncAsyncMethod())
              .build();
        }
      }
    }
    return result;
  }
}
