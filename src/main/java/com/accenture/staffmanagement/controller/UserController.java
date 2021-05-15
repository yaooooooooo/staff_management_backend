package com.accenture.staffmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/login/{eid}")
    public String login(@PathVariable("eid") String eid) {
        return "登录成功" + eid;
    }

    @GetMapping("/info/{eid}")
    public String getUserInfo(@PathVariable("eid") String eid) {
        return "用户信息" + eid;
    }
}
