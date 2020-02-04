package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/health")
    public String health() {
        return "I'm healthy";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
