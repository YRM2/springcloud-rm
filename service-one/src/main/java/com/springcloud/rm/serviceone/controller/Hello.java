package com.springcloud.rm.serviceone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String Hello(){
        System.out.println(port);
        return port;
    }
}
