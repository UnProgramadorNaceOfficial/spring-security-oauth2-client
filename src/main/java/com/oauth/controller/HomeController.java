package com.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!!";
    }

    @GetMapping("/helloSecured")
    public String helloSecured(){
        return "Hello World Secured!!";
    }
}
