package com.example.authentication.controller;

import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TestController {
    @GetMapping("/test")
    public String getMethodName(Principal principal) {
        String username = principal.getName();
        System.out.println(username);
        return "you can access this url means you are authenticated";
    }
    
}
