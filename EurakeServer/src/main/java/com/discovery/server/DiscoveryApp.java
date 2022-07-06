package com.discovery.server;

import com.discovery.server.dao.UserMapper;
import com.discovery.server.dao.UserMapperImpl2;
import com.discovery.server.service.UserService;
import com.discovery.server.service.UserServiceImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Huws
 */
//@EnableEurekaServer

@ComponentScan
public class DiscoveryApp {

    public static void main(String[] args) {
//        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(DiscoveryApp.class, args);
//        UserService userService = (UserService) configurableApplicationContext.getBean(UserServiceImp.class);
//        System.out.println(userService);
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DiscoveryApp.class);
        System.out.println(applicationContext.getBean(UserMapper.class, "1121"));
    }
}