package com.suanfa8.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    // 测试 github action

    // http://localhost:40020/hello
    // http://212.64.17.136:40020/hello
    @RequestMapping("/hello")
    public String hello() {
        return "测试 github action 我们的家乡在希望的田野上";
    }

}
