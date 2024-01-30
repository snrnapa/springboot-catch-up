package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Users;

@RestController
public class UserController {

    @GetMapping("/user")
    @ResponseBody
    public Users getUser() {
        Users user = new Users();
        user.setId(12);
        user.setName("皆伝になりたい人です");
        user.setAge(27);

        return user;
    }

}
