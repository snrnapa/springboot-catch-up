package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Worker {
    @GetMapping("/")
    public void getUser() {
        System.out.println("ここでええんやで");
    }

}
