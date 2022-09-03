package com.spring.mvc.controller;


import com.spring.mvc.model.Car;
import com.spring.mvc.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/mvc")
public class MvcController {

    @GetMapping("m1")
    public User test1() {
        return createUser();
    }

    private User createUser() {
        User user = new User();
        user.setName("渣渣辉");
        user.setAge(10);
        user.setMobile(Arrays.asList("181","182","183"));

        Car car = new Car();
        car.setCarName("bba");
        car.setCarNum(110);
        user.setCar(car);
        return user;
    }
}