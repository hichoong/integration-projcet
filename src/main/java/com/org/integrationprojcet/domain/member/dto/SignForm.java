package com.org.integrationprojcet.domain.member.dto;

import com.org.integrationprojcet.domain.member.enums.Gender;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SignForm {
    private String name;
    private String password;
    private String password2;
    private String username;
    private Gender gender;
}
