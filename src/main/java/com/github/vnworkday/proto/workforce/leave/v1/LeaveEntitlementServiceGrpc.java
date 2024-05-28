package com.github.vnworkday.proto.workforce.leave.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@jakarta.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: workforce/leave/v1/leave_entitlement_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LeaveEntitlementServiceGrpc {

  private LeaveEntitlementServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "workforce.leave.v1.LeaveEntitlementService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementRequest,
      com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementResponse> getGetLeaveEntitlementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLeaveEntitlement",
      requestType = com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementRequest.class,
      responseType = com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementRequest,
      com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementResponse> getGetLeaveEntitlementMethod() {
    io.grpc.MethodDescriptor<com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementRequest, com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementResponse> getGetLeaveEntitlementMethod;
    if ((getGetLeaveEntitlementMethod = LeaveEntitlementServiceGrpc.getGetLeaveEntitlementMethod) == null) {
      synchronized (LeaveEntitlementServiceGrpc.class) {
        if ((getGetLeaveEntitlementMethod = LeaveEntitlementServiceGrpc.getGetLeaveEntitlementMethod) == null) {
          LeaveEntitlementServiceGrpc.getGetLeaveEntitlementMethod = getGetLeaveEntitlementMethod =
              io.grpc.MethodDescriptor.<com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementRequest, com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLeaveEntitlement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaveEntitlementServiceMethodDescriptorSupplier("GetLeaveEntitlement"))
              .build();
        }
      }
    }
    return getGetLeaveEntitlementMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LeaveEntitlementServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaveEntitlementServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaveEntitlementServiceStub>() {
        @java.lang.Override
        public LeaveEntitlementServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaveEntitlementServiceStub(channel, callOptions);
        }
      };
    return LeaveEntitlementServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LeaveEntitlementServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaveEntitlementServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaveEntitlementServiceBlockingStub>() {
        @java.lang.Override
        public LeaveEntitlementServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaveEntitlementServiceBlockingStub(channel, callOptions);
        }
      };
    return LeaveEntitlementServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LeaveEntitlementServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaveEntitlementServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaveEntitlementServiceFutureStub>() {
        @java.lang.Override
        public LeaveEntitlementServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaveEntitlementServiceFutureStub(channel, callOptions);
        }
      };
    return LeaveEntitlementServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getLeaveEntitlement(com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementRequest request,
        io.grpc.stub.StreamObserver<com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLeaveEntitlementMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LeaveEntitlementService.
   */
  public static abstract class LeaveEntitlementServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LeaveEntitlementServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LeaveEntitlementService.
   */
  public static final class LeaveEntitlementServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LeaveEntitlementServiceStub> {
    private LeaveEntitlementServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaveEntitlementServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaveEntitlementServiceStub(channel, callOptions);
    }

    /**
     */
    public void getLeaveEntitlement(com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementRequest request,
        io.grpc.stub.StreamObserver<com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLeaveEntitlementMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LeaveEntitlementService.
   */
  public static final class LeaveEntitlementServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LeaveEntitlementServiceBlockingStub> {
    private LeaveEntitlementServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaveEntitlementServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaveEntitlementServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementResponse getLeaveEntitlement(com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLeaveEntitlementMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LeaveEntitlementService.
   */
  public static final class LeaveEntitlementServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LeaveEntitlementServiceFutureStub> {
    private LeaveEntitlementServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaveEntitlementServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaveEntitlementServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementResponse> getLeaveEntitlement(
        com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLeaveEntitlementMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LEAVE_ENTITLEMENT = 0;

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
        case METHODID_GET_LEAVE_ENTITLEMENT:
          serviceImpl.getLeaveEntitlement((com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementRequest) request,
              (io.grpc.stub.StreamObserver<com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetLeaveEntitlementMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementRequest,
              com.github.vnworkday.proto.workforce.leave.v1.GetLeaveEntitlementResponse>(
                service, METHODID_GET_LEAVE_ENTITLEMENT)))
        .build();
  }

  private static abstract class LeaveEntitlementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LeaveEntitlementServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.vnworkday.proto.workforce.leave.v1.LeaveEntitlementServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LeaveEntitlementService");
    }
  }

  private static final class LeaveEntitlementServiceFileDescriptorSupplier
      extends LeaveEntitlementServiceBaseDescriptorSupplier {
    LeaveEntitlementServiceFileDescriptorSupplier() {}
  }

  private static final class LeaveEntitlementServiceMethodDescriptorSupplier
      extends LeaveEntitlementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LeaveEntitlementServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LeaveEntitlementServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LeaveEntitlementServiceFileDescriptorSupplier())
              .addMethod(getGetLeaveEntitlementMethod())
              .build();
        }
      }
    }
    return result;
  }
}
