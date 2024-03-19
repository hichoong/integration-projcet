package com.org.integrationprojcet.controller;

import com.org.integrationprojcet.redis.RedisUtil;
import com.org.integrationprojcet.redis.RedisStringForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
@RequiredArgsConstructor
public class RedisController {

    private final RedisUtil redisUtil;
    @GetMapping("/redis")
    public String redis() {
        return "redis/redis";
    }
    @GetMapping("/redis/list")
    public String allList(Model model) {
        Map<String, String> keyList = redisUtil.getAllList();
        model.addAttribute("keyList", keyList);
        return "redis/redis-list";
    }

    @GetMapping("/redis/add")
    public String addStringView(Model model) {
        model.addAttribute("stringForm", new RedisStringForm());
        return "redis/redis-add";
    }
    @PostMapping("/redis/add")
    public String addString(@ModelAttribute RedisStringForm stringForm) {
        redisUtil.addString(stringForm.getKey(), stringForm.getValue());
        return "redis/redis";
    }
}
