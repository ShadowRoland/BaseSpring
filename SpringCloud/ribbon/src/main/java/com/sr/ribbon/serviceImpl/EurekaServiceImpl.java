package com.sr.ribbon.serviceImpl;

import com.sr.ribbon.service.EurekaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("eurekaService")
public class EurekaServiceImpl implements EurekaService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/hi?name="+name,String.class);
    }
}
