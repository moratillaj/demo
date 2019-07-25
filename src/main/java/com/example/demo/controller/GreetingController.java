package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/greet")
public class GreetingController {
    @Value("${greeting}")
    String greeting;

    @GetMapping
    public String greet(@RequestParam("name") String name) {
        return greeting + " " + name;
    }
}
