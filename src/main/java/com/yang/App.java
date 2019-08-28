package com.yang;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.yang.datasource",
        "com.yang.web","com.yang.test1.service","com.yang.test2.service"})
public class App {
    public static void main(String[] args) {
         //启动springboot项目
        SpringApplication.run(App.class,args);
    }
}
