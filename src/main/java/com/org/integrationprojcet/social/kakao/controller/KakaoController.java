package com.org.integrationprojcet.social.kakao.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class KakaoController {

    @GetMapping("/kakao/oauth/login")
    public String kakaoLogin() {
        return "hello";
    }
}
