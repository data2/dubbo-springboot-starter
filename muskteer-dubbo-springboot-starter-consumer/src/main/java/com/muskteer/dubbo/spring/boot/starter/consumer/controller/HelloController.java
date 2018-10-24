package com.muskteer.dubbo.spring.boot.starter.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.muskteer.dubbo.spring.boot.starter.api.RPCHelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Reference(version = "${demo.service.version}")
    RPCHelloService rpcHelloService;

    @RequestMapping("/hi")
    public String hi(String name) {
        return rpcHelloService.hi(name);

    }
}
