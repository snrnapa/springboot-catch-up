package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Worker;

@RestController
public class WorkerController {

    @GetMapping("/user")
    @ResponseBody
    public Worker getUser() {
        Worker user = new Worker();
        user.setId(12);
        user.setName("皆伝になりたい人です");
        user.setAge(27);

        return user;
    }

}
