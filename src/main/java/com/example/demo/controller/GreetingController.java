package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.String.format;

@RestController("/greet")
public class GreetingController {
    @Value("${greeting}")
    String greeting;

    @GetMapping
    public String greet(@RequestParam("name") String name) {
        return format(greeting, name);
    }
}
