package com.spring.mvc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class MvcApplication implements ApplicationRunner, CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(MvcApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }

    public void run(ApplicationArguments args) throws Exception {
        log.info("spring-boot 启动完成");
    }

    public void run(String... args) throws Exception {
        log.info("spring-boot 启动完成");
    }
}
