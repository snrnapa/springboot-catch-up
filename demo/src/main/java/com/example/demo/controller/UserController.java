package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;

@RestController
public class UserController {
    @GetMapping("/")
    @ResponseBody
    public User getUser() {
        User user = new User();
        user.setId(12);
        user.setName("皆伝になりたい人です");
        user.setAge(27);

        return user;
    }

}
