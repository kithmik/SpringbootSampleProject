package com.example.springbootdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @GetMapping("/")
//    public String hello() {
//        return "Hello, Spring Boot!";
//    }

    @Value("${custom.message:Default Hello}")
    private String message;

    @GetMapping("/")
    public String home() {
        return message;
    }

}
