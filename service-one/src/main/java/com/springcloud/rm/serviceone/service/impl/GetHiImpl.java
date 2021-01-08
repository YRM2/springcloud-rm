package com.springcloud.rm.serviceone.service.impl;

import com.springcloud.rm.serviceone.service.IGetHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetHiImpl implements IGetHi {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Integer getHi() {
        String url = "http://service-two/hi";
        return restTemplate.getForEntity(url, Integer.class).getBody();
    }
}
