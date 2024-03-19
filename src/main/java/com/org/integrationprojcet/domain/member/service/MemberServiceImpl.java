package com.org.integrationprojcet.domain.member.service;

import com.org.integrationprojcet.domain.member.dto.LoginForm;
import com.org.integrationprojcet.domain.member.dto.LoginMember;
import com.org.integrationprojcet.domain.member.dto.SignForm;
import com.org.integrationprojcet.domain.member.entity.Member;
import com.org.integrationprojcet.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl {

    private final MemberRepository repository;
    public LoginMember login(LoginForm loginForm) {
        Optional<Member> member = repository.findByNickname(loginForm.getNickname());
        if (!member.isPresent()) {
            throw new RuntimeException("해당 아이디가 존재하지 않습니다");
        }
        if (member.get().getPassword() != loginForm.getPassword()) {
            throw new RuntimeException("비밀번호가 일치하지 않습니다.");
        }
        LoginMember loginMember = new LoginMember(
                member.get().getId(), member.get().getName(), member.get().getNickname(), member.get().getGender());
        return loginMember;
    }


    public void sign(SignForm signForm) {
        Member member = new Member();
        member.setName(signForm.getName());
        member.setNickname(signForm.getNickname());
        member.setPassword(signForm.getPassword());
        member.setGender(signForm.getGender());
        Optional<Member> member1 = repository.findByNickname(member.getNickname());
        if (member1.isPresent()) {
            throw new RuntimeException("해당 아이디는 존재합니다.");
        }
        repository.save(member);
    }
}
