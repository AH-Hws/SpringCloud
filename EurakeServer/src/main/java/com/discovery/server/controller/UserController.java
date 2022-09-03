package com.discovery.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/c1")
public class UserController {

    @RequestMapping("/c2")
    public String aa() {
        return "66666";
    }
}