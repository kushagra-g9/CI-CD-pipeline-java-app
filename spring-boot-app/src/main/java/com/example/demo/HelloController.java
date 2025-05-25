package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello, Spring Boot! from Kushagra Gupta Devops Engineer || Testing my Automation Project | Updating Image Via Argocd | Checking Version is everything  working perfectly";
        
    }
}
