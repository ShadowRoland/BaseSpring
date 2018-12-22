package com.sr.ribbon.controller;

import com.sr.ribbon.service.EurekaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaController {
    @Autowired
    EurekaService eurekaService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return eurekaService.hiService( name );
    }
}
