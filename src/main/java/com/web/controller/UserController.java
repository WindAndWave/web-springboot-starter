package com.web.controller;

import com.web.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/user")
    public Object user (){
        User user = new User();
        user.setId("1");
        user.setName("lalal");
        user.setPassword("123");
        return user;
    }
}
