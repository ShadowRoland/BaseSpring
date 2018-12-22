package com.sr.feign.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client")
public interface EurekaService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String hiService(@RequestParam(value = "name") String name);
}
