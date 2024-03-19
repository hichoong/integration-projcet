package com.org.integrationprojcet.domain.member.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Gender {
    Male("남자", "M"),
    Female("여자", "F");

    private String description;
    private String initial;
}
