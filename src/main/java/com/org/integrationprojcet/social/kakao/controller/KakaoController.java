package com.org.integrationprojcet.social.kakao.controller;

import com.org.integrationprojcet.social.kakao.dto.KakaoAPI;
import com.org.integrationprojcet.social.kakao.dto.KakaoProfile;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequiredArgsConstructor
@Slf4j
public class KakaoController {

    private final KakaoAPI kakaoAPI;
    @GetMapping("/kakao/oauth/login")
    @ResponseBody
    public String kakaoLogin(@RequestParam String code, Model model){
        // 1. 인가 코드 받기 (@RequestParam String code)

        // 2. 토큰 받기
        String accessToken = kakaoAPI.getAccessToken(code);

        // 3. 사용자 정보 받기
        KakaoProfile userInfo = kakaoAPI.getUserInfo(accessToken);
        return userInfo.toString();
    }
}
