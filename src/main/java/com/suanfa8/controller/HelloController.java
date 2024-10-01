package com.suanfa8.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // 测试 github webhook

    // http://localhost:8080/hello
    @RequestMapping("/hello")
    public String hello() {
        return "测试 github webhook";
    }

}
