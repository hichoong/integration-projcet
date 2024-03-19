package com.org.integrationprojcet.domain.member.controller;

import com.org.integrationprojcet.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

}
