package com.org.integrationprojcet.domain.member.controller;

import com.org.integrationprojcet.domain.member.dto.LoginForm;
import com.org.integrationprojcet.domain.member.dto.LoginMember;
import com.org.integrationprojcet.domain.member.dto.SignForm;
import com.org.integrationprojcet.domain.member.service.MemberServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberServiceImpl memberService;

    @GetMapping("/login-form")
    public String loginForm(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }

    @PostMapping("/login-form")
    public String loginForm(Model model, @RequestAttribute LoginForm loginForm) {
        LoginMember loginMember = memberService.login(loginForm);
        return "redirect:/redis";
    }

    @GetMapping("sign-form")
    public String signForm(Model model) {
        model.addAttribute("signForm", new SignForm());
        return "sign";
    }

    @PostMapping("/sign-form")
    public String signForm(@RequestAttribute SignForm signForm, Model model) {
        memberService.sign(signForm);
        return "login";
    }
}
