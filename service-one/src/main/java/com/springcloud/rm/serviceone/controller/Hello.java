package com.springcloud.rm.serviceone.controller;

import com.springcloud.rm.serviceone.service.IGetHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Hello {

    @Value("${server.port}")
    String port;

    @Value("${env}")
    String logLevel;

    @Autowired
    private IGetHi getHi;

    @GetMapping("/hello")
    public String Hello(){
        System.out.println(port);
        System.out.println("call service-two interface: " + getHi.getHi());
        return port ;
    }

    @GetMapping("/logLevel")
    public String LogLevel(){
        System.out.println(logLevel);
        return logLevel;
    }
}
