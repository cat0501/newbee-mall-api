package com.newbee.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Bootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Bootstrap.class, args);
    }
}