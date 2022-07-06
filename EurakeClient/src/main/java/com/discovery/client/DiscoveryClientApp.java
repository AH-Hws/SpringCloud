package com.discovery.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Huws
 * @date 2022/5/4 20:09
 **/

@SpringBootApplication
@EnableDiscoveryClient
public class DiscoveryClientApp {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryClientApp.class, args);
    }
}
