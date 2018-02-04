package com.authenticationserver.authenticationserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(value = "/admin")
    public String test(){
        return "YOU'RE ADMIN";
    }
}
