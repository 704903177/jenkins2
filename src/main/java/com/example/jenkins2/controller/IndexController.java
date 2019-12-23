package com.example.jenkins2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("index")
    public String index(){
        return "hello world";
    }

    @GetMapping("git")
    public String git(){
        return "git pull1";
    }

}
