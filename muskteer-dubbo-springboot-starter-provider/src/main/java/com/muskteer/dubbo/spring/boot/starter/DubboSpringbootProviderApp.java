package com.muskteer.dubbo.spring.boot.starter;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
@EnableDubbo
@SpringBootApplication
public class DubboSpringbootProviderApp {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(DubboSpringbootProviderApp.class, args);
        System.in.read(); // press any key to exit
    }
}
