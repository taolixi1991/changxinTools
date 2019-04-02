package com.changxin.tools.service;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class CheckInService {

    @RequestMapping("/test")
    public String run() {
        return "Hello World!";
    }
}
