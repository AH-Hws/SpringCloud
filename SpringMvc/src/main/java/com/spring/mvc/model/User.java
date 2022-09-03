package com.spring.mvc.model;

import lombok.Setter;

import java.util.List;

@Setter
public class User {
    private String name;
    private int age;
    private List<String> mobile;
    private Car car;
}
