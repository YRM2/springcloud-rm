package com.servicetwo.servicetwo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hi {

    @Value("${order_loop_time}")
    private Integer orderLoopTime;

    @GetMapping("/hi")
    public Integer syaHi(){

        System.out.print("This is me");
        return orderLoopTime;
    }
}
