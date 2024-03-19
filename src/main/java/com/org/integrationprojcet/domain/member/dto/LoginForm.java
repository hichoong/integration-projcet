package com.org.integrationprojcet.domain.member.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LoginForm {
    private String nickname;
    private String password;
}
