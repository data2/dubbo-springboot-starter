package com.muskteer.dubbo.spring.boot.starter.rest.autoconfig;

import com.alibaba.dubbo.config.ProtocolConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean("dubbo")
    public ProtocolConfig dubboConfig(){
        ProtocolConfig c = new ProtocolConfig();
        c.setName("dubbo");
        c.setId("dubbo");
        c.setServer(null);
        c.setPort(20880);
        return c;
    }

    @Bean("rest")
    public ProtocolConfig restConfig(){
        ProtocolConfig c = new ProtocolConfig();
        c.setName("rest");
        c.setId("rest");
        c.setServer("tomcat");
        c.setPort(8881);
        return c;
    }
}
