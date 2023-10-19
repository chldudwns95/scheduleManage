package com.choi.publicScheduleMange.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/, /index")
    public String index() {
        return "index2";
    }

    @GetMapping("/login")
    public String login() {
        return "user/login";

    }

    @GetMapping("/register")
    public String register() {
        return "user/register";
    }

    @GetMapping("/logout")
    public String logout() {
        return "index2";
    }

}
