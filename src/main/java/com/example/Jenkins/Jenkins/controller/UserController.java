package com.example.Jenkins.Jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String greet(){
        return "Hello Sham";
    }
}
