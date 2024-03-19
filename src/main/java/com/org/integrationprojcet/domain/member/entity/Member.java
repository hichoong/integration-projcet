package com.org.integrationprojcet.domain.member.entity;

import com.org.integrationprojcet.domain.member.enums.Gender;
import jakarta.persistence.*;
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
    @Column
    private String name;
    @Column
    private String nickname;
    @Column
    private String password;
    @Column
    private Gender gender;
}
