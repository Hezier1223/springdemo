package com.hezier.demo.controller;

import com.hezier.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserController {//表现层
    @Autowired
    private UserService userService;

    public void controller() {
        userService.service();
        System.out.println("this is @Controller表现层 调用业务层");
    }
}