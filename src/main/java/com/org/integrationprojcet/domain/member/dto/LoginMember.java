package com.org.integrationprojcet.domain.member.dto;

import com.org.integrationprojcet.domain.member.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class LoginMember {

    private Long id;
    private String name;
    private String nickname;
    private Gender gender;
}
