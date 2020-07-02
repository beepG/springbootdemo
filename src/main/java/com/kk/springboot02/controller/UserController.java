package com.kk.springboot02.controller;


import com.kk.springboot02.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("test")
    public Object test(){

        User user=new User();
        user.setName("zhangsan");
        user.setAge(20);
        user.setEmail("admin@kk.com");

        return user;
    }
}
