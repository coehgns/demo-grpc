//package com.example.demogrpc.domain.member.mapper;
//
//import com.example.demogrpc.MemberProto;
//import com.example.demogrpc.domain.member.domain.Member;
//import com.example.demogrpc.domain.member.presentation.dto.request.MemberSignUpRequestDTO;
//import org.mapstruct.Mapper;
//import org.mapstruct.ReportingPolicy;
//
///**
// * componentModel = "spring"를 사용하여 스프링 컨테이너에 빈으로 등록합니다.
// * unmappedTargetPolicy를 IGNORE로 설정하면서 매핑되지 않은 필드를 null로 처리합니다.
// */
//@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
//public interface MemberMapper {
//    // gRPC request를 DTO로 변환합니다.
//    MemberSignUpRequestDTO requestProtoToDto(MemberProto.MemberRequest member);
//
//    // Member Entity를 gRPC response로 변환합니다.
//    MemberProto.MemberCreateResponse dtoToResponseProto(Member createMember);
//
//    // signUp request를 Member Entity로 변환합니다.
//    Member dtoToEntity(MemberSignUpRequestDTO memberDTO);
//}
