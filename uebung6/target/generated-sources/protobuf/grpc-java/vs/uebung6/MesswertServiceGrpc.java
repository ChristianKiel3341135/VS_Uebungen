package vs.uebung6;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: service.proto")
public final class MesswertServiceGrpc {

  private MesswertServiceGrpc() {}

  public static final String SERVICE_NAME = "vs.uebung6.MesswertService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<vs.uebung6.Messwert,
      vs.uebung6.Bewertung> getUploadMessWertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "uploadMessWert",
      requestType = vs.uebung6.Messwert.class,
      responseType = vs.uebung6.Bewertung.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vs.uebung6.Messwert,
      vs.uebung6.Bewertung> getUploadMessWertMethod() {
    io.grpc.MethodDescriptor<vs.uebung6.Messwert, vs.uebung6.Bewertung> getUploadMessWertMethod;
    if ((getUploadMessWertMethod = MesswertServiceGrpc.getUploadMessWertMethod) == null) {
      synchronized (MesswertServiceGrpc.class) {
        if ((getUploadMessWertMethod = MesswertServiceGrpc.getUploadMessWertMethod) == null) {
          MesswertServiceGrpc.getUploadMessWertMethod = getUploadMessWertMethod =
              io.grpc.MethodDescriptor.<vs.uebung6.Messwert, vs.uebung6.Bewertung>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "uploadMessWert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vs.uebung6.Messwert.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vs.uebung6.Bewertung.getDefaultInstance()))
              .setSchemaDescriptor(new MesswertServiceMethodDescriptorSupplier("uploadMessWert"))
              .build();
        }
      }
    }
    return getUploadMessWertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<vs.uebung6.Messwert,
      vs.uebung6.Bewertung> getUploadWertePerStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "uploadWertePerStream",
      requestType = vs.uebung6.Messwert.class,
      responseType = vs.uebung6.Bewertung.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<vs.uebung6.Messwert,
      vs.uebung6.Bewertung> getUploadWertePerStreamMethod() {
    io.grpc.MethodDescriptor<vs.uebung6.Messwert, vs.uebung6.Bewertung> getUploadWertePerStreamMethod;
    if ((getUploadWertePerStreamMethod = MesswertServiceGrpc.getUploadWertePerStreamMethod) == null) {
      synchronized (MesswertServiceGrpc.class) {
        if ((getUploadWertePerStreamMethod = MesswertServiceGrpc.getUploadWertePerStreamMethod) == null) {
          MesswertServiceGrpc.getUploadWertePerStreamMethod = getUploadWertePerStreamMethod =
              io.grpc.MethodDescriptor.<vs.uebung6.Messwert, vs.uebung6.Bewertung>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "uploadWertePerStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vs.uebung6.Messwert.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vs.uebung6.Bewertung.getDefaultInstance()))
              .setSchemaDescriptor(new MesswertServiceMethodDescriptorSupplier("uploadWertePerStream"))
              .build();
        }
      }
    }
    return getUploadWertePerStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MesswertServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MesswertServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MesswertServiceStub>() {
        @java.lang.Override
        public MesswertServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MesswertServiceStub(channel, callOptions);
        }
      };
    return MesswertServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MesswertServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MesswertServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MesswertServiceBlockingStub>() {
        @java.lang.Override
        public MesswertServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MesswertServiceBlockingStub(channel, callOptions);
        }
      };
    return MesswertServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MesswertServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MesswertServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MesswertServiceFutureStub>() {
        @java.lang.Override
        public MesswertServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MesswertServiceFutureStub(channel, callOptions);
        }
      };
    return MesswertServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MesswertServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void uploadMessWert(vs.uebung6.Messwert request,
        io.grpc.stub.StreamObserver<vs.uebung6.Bewertung> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadMessWertMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<vs.uebung6.Messwert> uploadWertePerStream(
        io.grpc.stub.StreamObserver<vs.uebung6.Bewertung> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadWertePerStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadMessWertMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                vs.uebung6.Messwert,
                vs.uebung6.Bewertung>(
                  this, METHODID_UPLOAD_MESS_WERT)))
          .addMethod(
            getUploadWertePerStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                vs.uebung6.Messwert,
                vs.uebung6.Bewertung>(
                  this, METHODID_UPLOAD_WERTE_PER_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class MesswertServiceStub extends io.grpc.stub.AbstractAsyncStub<MesswertServiceStub> {
    private MesswertServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MesswertServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MesswertServiceStub(channel, callOptions);
    }

    /**
     */
    public void uploadMessWert(vs.uebung6.Messwert request,
        io.grpc.stub.StreamObserver<vs.uebung6.Bewertung> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadMessWertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<vs.uebung6.Messwert> uploadWertePerStream(
        io.grpc.stub.StreamObserver<vs.uebung6.Bewertung> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getUploadWertePerStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class MesswertServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MesswertServiceBlockingStub> {
    private MesswertServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MesswertServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MesswertServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public vs.uebung6.Bewertung uploadMessWert(vs.uebung6.Messwert request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadMessWertMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MesswertServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MesswertServiceFutureStub> {
    private MesswertServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MesswertServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MesswertServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vs.uebung6.Bewertung> uploadMessWert(
        vs.uebung6.Messwert request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadMessWertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD_MESS_WERT = 0;
  private static final int METHODID_UPLOAD_WERTE_PER_STREAM = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MesswertServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MesswertServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_MESS_WERT:
          serviceImpl.uploadMessWert((vs.uebung6.Messwert) request,
              (io.grpc.stub.StreamObserver<vs.uebung6.Bewertung>) responseObserver);
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
        case METHODID_UPLOAD_WERTE_PER_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadWertePerStream(
              (io.grpc.stub.StreamObserver<vs.uebung6.Bewertung>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MesswertServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MesswertServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return vs.uebung6.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MesswertService");
    }
  }

  private static final class MesswertServiceFileDescriptorSupplier
      extends MesswertServiceBaseDescriptorSupplier {
    MesswertServiceFileDescriptorSupplier() {}
  }

  private static final class MesswertServiceMethodDescriptorSupplier
      extends MesswertServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MesswertServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MesswertServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MesswertServiceFileDescriptorSupplier())
              .addMethod(getUploadMessWertMethod())
              .addMethod(getUploadWertePerStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
