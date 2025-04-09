package com.example.demogrpc.domain.member.service;

import com.example.demogrpc.domain.member.domain.Member;
import com.example.demogrpc.domain.member.domain.repository.MemberRepository;
import com.example.demogrpc.domain.member.mapper.MemberMapper;
import com.example.demogrpc.domain.member.presentation.dto.request.MemberSignUpRequestDTO;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    private final MemberMapper memberMapper;

    @Transactional
    public Member createMember(MemberSignUpRequestDTO request) {
        Member member = memberMapper.dtoToEntity(request);
        return memberRepository.save(member);
    }
}
