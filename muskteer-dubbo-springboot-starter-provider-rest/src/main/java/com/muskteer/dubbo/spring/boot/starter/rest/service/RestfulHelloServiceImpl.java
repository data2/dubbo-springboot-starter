package com.muskteer.dubbo.spring.boot.starter.rest.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.muskteer.dubbo.spring.boot.starter.api.RestfulHelloService;

@Service(version = "${demo.service.version}" , protocol = "rest")
public class RestfulHelloServiceImpl implements RestfulHelloService {
    @Override
    public String hi(String name) {
        return "hi , ".concat(name).concat(" from dubbo-springboot by restful");
    }

}
