package com.org.integrationprojcet.domain.member.repository;

import com.org.integrationprojcet.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository {
    @Override
    List findAll(Member member);
}
