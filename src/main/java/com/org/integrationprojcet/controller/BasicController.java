package com.org.integrationprojcet.controller;

import com.org.integrationprojcet.social.kakao.dto.KakaoAPI;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class BasicController {

    private final KakaoAPI kakaoAPI;
    @GetMapping("/home")
    public String basic (@NotNull Model model) {
        model.addAttribute("kakaoApiKey", kakaoAPI.getApiKey());
        model.addAttribute("redirectUrl", kakaoAPI.getRedirectUrl());
        return "index";
    }
    @GetMapping("/hello")
    public String hello (Model model, @RequestParam(defaultValue = "Hi") String value) {
        model.addAttribute("value", value);
        return "hello";
    }
}
