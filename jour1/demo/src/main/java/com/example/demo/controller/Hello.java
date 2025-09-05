package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;

@Controller
public class HelloController {

    @Value("${greeting.message}")
    private String greetingMessage;

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("message", greetingMessage);
        return "hello"; // This will look for a template named "hello.html" in src/main/resources/templates
    }
}