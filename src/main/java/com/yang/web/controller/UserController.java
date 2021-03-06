package com.yang.web.controller;


import com.yang.test1.service.UserServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //声明Rest风格的控制器
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;


    @RequestMapping("register")
    @ResponseBody
    public String register(String username,String password){
        //把数据保存到test1数据库
        userService.register(username,password);
        return "success";
    }

    @RequestMapping("login")
    @ResponseBody
    public String login(String username,String password){
        return "success";
    }


}
