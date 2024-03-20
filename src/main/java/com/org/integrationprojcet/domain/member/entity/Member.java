package com.org.integrationprojcet.domain.member.entity;

import com.org.integrationprojcet.domain.member.enums.Gender;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_id")
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Builder
    public Member(String name, String nickname, String password, Gender gender) {
        this.name = name;
        this.username = nickname;
        this.password = password;
        this.gender = gender;
    }
}
