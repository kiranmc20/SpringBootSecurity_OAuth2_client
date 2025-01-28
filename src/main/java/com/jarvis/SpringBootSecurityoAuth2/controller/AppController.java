package com.jarvis.SpringBootSecurityoAuth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public String login(){
        return "User is logged in";
    }
}
