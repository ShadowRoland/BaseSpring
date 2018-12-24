package com.sr.feign.serviceImpl;

import com.sr.feign.service.EurekaService;
import org.springframework.stereotype.Component;

@Component
public class EurekaServiceImpl implements EurekaService {
    @Override
    public String hiService(String name) {
        return "sorry "+name;
    }
}
