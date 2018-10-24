package com.muskteer.dubbo.spring.boot.starter.rest;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@EnableDubbo
@SpringBootApplication
public class DubboSpringbootProviderRestfulApp {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(DubboSpringbootProviderRestfulApp.class, args);
        System.in.read(); // press any key to exit
    }
}
