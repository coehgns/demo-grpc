//package com.example.demogrpc.domain.member.service;
//
//import com.example.demogrpc.MemberProto;
//import com.example.demogrpc.MemberServiceGrpc;
//import com.example.demogrpc.domain.member.domain.Member;
//import com.example.demogrpc.domain.member.mapper.MemberMapper;
//import com.example.demogrpc.domain.member.presentation.dto.request.MemberSignUpRequestDTO;
//import io.grpc.stub.StreamObserver;
//import jakarta.transaction.Transactional;
//import lombok.RequiredArgsConstructor;
//import org.springframework.grpc.server.service.GrpcService;
//
//@GrpcService
//@RequiredArgsConstructor
//public class MemberServiceGrpcImpl extends MemberServiceGrpc.MemberServiceImplBase {
//    private final MemberMapper memberMapper;
//    private final MemberService memberService;
//
//    @Transactional
//    public void createMember(
//            MemberProto.MemberRequest request,
//            StreamObserver<MemberProto.MemberCreateResponse> responseStreamObserver
//    ) {
//        // 클라이언트로부터 전달 받은 request를 DTO로 변환시킵니다.
//        MemberSignUpRequestDTO memberDTO = memberMapper.requestProtoToDto(request);
//
//        Member createMember = memberService.createMember(memberDTO);
//
//        // DB에 저장된 데이터를 gRPC response 데이터로 변환합니다.
//        MemberProto.MemberCreateResponse response = memberMapper.dtoToResponseProto(createMember);
//
//        // 응답을 클라이언트에게 전달합니다.
//        responseStreamObserver.onNext(response);
//        responseStreamObserver.onCompleted();
//    }
//}
