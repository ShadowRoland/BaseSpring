package com.sr.feign.service;

import org.springframework.stereotype.Component;

@Component
public class EurekaServiceHystric implements EurekaService {
    @Override
    public String hiService(String name) {
        return "sorry "+name;
    }
}
