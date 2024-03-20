package com.org.integrationprojcet.domain.member.controller;

import com.org.integrationprojcet.domain.member.dto.SignForm;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {

    //private final MemberServiceImpl memberService;
    @GetMapping("/member/sign-form")
    public String signForm(@NotNull Model model) {
        model.addAttribute("signForm", new SignForm());
        return "sign";
    }
    @PostMapping("/member/sign")
    public String signForm(@ModelAttribute SignForm signForm, Model model) {
        //memberService.sign(signForm);
        return "login";
    }

    @GetMapping("/member/home")
    public String memberHome() {
        return "member/home";
    }
}
