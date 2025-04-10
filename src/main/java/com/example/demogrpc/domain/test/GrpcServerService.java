package com.example.demogrpc.domain.test;

import com.example.demogrpc.SimpleGrpc;
import com.example.demogrpc.TestProto;
import io.grpc.stub.StreamObserver;
import org.springframework.grpc.server.service.GrpcService;

@GrpcService
public class GrpcServerService extends SimpleGrpc.SimpleImplBase {

    @Override
    public void sayHello(TestProto.HelloRequest request, StreamObserver<TestProto.HelloReply> streamObserver) {
        TestProto.HelloReply reply = TestProto.HelloReply.newBuilder()
                .setMessage("Hello ==> " + request.getName())
                .build();
        streamObserver.onNext(reply);
        streamObserver.onCompleted();
    }
}
