package com.example.demogrpc.domain.member.domain.repository;

import com.example.demogrpc.domain.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
