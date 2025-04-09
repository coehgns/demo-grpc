package com.example.demogrpc.domain.member.presentation.dto.request;

import lombok.Getter;

@Getter
public class MemberSignUpRequestDTO {
    private Long id;
    private String name;
    private String email;
    private String password;
}
