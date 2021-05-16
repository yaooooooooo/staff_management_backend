package com.accenture.staffmanagement.controller;

import com.accenture.staffmanagement.entity.User;
import com.accenture.staffmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login/{eid}")
    public String login(@PathVariable("eid") String eid) {
        return "登录成功" + eid;
    }

//    @GetMapping(value = "/info/eid/{eid}", produces = "application/json;charset=utf-
    @GetMapping("/info/eid/{eid}")
    public User getUserInfo(@PathVariable("eid") String eid) {
        return userService.getUserByEid(eid);
    }

//    @GetMapping(value = "/info/id/{id}", produces = "application/json;charset=utf-8")
    @GetMapping("/info/id/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        User user = userService.getUserById(id);
//        System.out.println(user);
        return user;
    }
}
