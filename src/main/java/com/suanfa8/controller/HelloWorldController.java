package com.suanfa8.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    // 测试 github action

    // http://localhost:40020/hello
    @RequestMapping("/hello")
    public String hello() {
        return "测试 github action";
    }

}
