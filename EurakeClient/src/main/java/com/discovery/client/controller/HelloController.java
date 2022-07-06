package com.discovery.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Huws
 * @date 2022/5/24 11:12
 **/

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String getHello() {
        return "hello";
    }
}
