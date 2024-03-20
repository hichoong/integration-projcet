package com.org.integrationprojcet.domain.member.controller;

import com.org.integrationprojcet.domain.member.dto.LoginForm;
import com.org.integrationprojcet.domain.member.dto.LoginMember;
import com.org.integrationprojcet.domain.member.dto.SignForm;
import com.org.integrationprojcet.domain.member.service.MemberServiceImpl;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

@Controller
@RequiredArgsConstructor
public class MemberController {

    //private final MemberServiceImpl memberService;

    @GetMapping("/login-page")
    public String loginForm() {
        return "login";
    }
    @GetMapping("/sign")
    public String signForm(@NotNull Model model) {
        model.addAttribute("signForm", new SignForm());
        return "sign";
    }
    @PostMapping("/sign")
    public String signForm(@RequestAttribute SignForm signForm, Model model) {
        //memberService.sign(signForm);
        return "login";
    }
}
