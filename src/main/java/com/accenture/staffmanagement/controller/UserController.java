package com.accenture.staffmanagement.controller;

import com.accenture.staffmanagement.entity.User;
import com.accenture.staffmanagement.exception.BizException;
import com.accenture.staffmanagement.service.UserService;
import com.accenture.staffmanagement.utils.JwtUtils;
import com.accenture.staffmanagement.utils.PassToken;
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

    @PassToken
    @GetMapping("/login/{eid}")
    public String login(@PathVariable("eid") String eid) {
        User user = userService.getUserByEid(eid);
        if (null == user) {
            throw new BizException("-1", "未查找到用户！");
        }

        String jwtToken = JwtUtils.createToken(user.getEid(), "", user.getName());

        return "登录成功 : " + jwtToken;
    }

//    @GetMapping(value = "/info/eid/{eid}", produces = "application/json;charset=utf-
    @GetMapping("/info/eid/{eid}")
    public User getUserInfo(@PathVariable("eid") String eid) {
        User user = userService.getUserByEid(eid);
        if (null == user) {
            throw new BizException("-1", "未查找到用户！");
        }
        return user;
    }

//    @GetMapping(value = "/info/id/{id}", produces = "application/json;charset=utf-8")
    @GetMapping("/info/id/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        User user = userService.getUserById(id);
        if (null == user) {
            throw new BizException("-1", "未查找到用户！");
        }
        return user;
    }
}
