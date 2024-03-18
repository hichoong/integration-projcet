package com.org.integrationprojcet.controller;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BasicController {

    @GetMapping("/")
    public String basic () {
        return "index";
    }
    @GetMapping("/hello")
    public String hello (Model model, @RequestParam(defaultValue = "Hi") String value) {
        model.addAttribute("value", value);
        return "hello";
    }
}
