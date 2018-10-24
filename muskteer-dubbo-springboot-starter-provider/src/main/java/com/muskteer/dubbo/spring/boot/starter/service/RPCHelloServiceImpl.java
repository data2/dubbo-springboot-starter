package com.muskteer.dubbo.spring.boot.starter.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.muskteer.dubbo.spring.boot.starter.api.RPCHelloService;

@Service(version = "${demo.service.version}")
public class RPCHelloServiceImpl implements RPCHelloService {
    @Override
    public String hi(String name) {
        return "hi , ".concat(name).concat(" from dubbo-springboot by rpc");
    }
}
