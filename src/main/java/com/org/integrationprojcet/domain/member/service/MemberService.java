package com.org.integrationprojcet.domain.member.service;

import com.org.integrationprojcet.domain.member.dto.LoginForm;
import com.org.integrationprojcet.domain.member.dto.LoginMember;
import com.org.integrationprojcet.domain.member.dto.SignForm;

public interface MemberService {
    LoginMember login(LoginForm loginForm);
    void sign(SignForm signForm);
}
