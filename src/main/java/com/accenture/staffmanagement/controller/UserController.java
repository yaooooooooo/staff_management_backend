package com.accenture.staffmanagement.controller;

import com.accenture.staffmanagement.entity.User;
import com.accenture.staffmanagement.exception.BizException;
import com.accenture.staffmanagement.service.UserService;
import com.accenture.staffmanagement.utils.JwtAuthenticationInterceptor;
import com.accenture.staffmanagement.utils.JwtUtils;
import com.accenture.staffmanagement.utils.PassToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PassToken
    @ApiOperation("Get User JWT token.")
    @GetMapping("/login/{eid}")
    public Map<String, String> login(@PathVariable("eid") String eid) {
        Map<String, String> res = new HashMap<>();
        User user = userService.getUserByEid(eid);
        if (null == user) {
            throw new BizException("-1", "未查找到用户！");
        }

        String jwtToken = JwtUtils.createToken(user.getEid(), "", user.getName());
        res.put("status", "success");
        res.put("token", jwtToken);
        return res;
    }

    @ApiOperation("Get User by Eid.")
    @GetMapping("/info/eid/{eid}")
    public User getUserInfo(@PathVariable("eid") String eid,
                            @RequestAttribute(JwtAuthenticationInterceptor.JWT_USER) User currentUser) {
        logger.info("当前登录用户 : " + currentUser);
        User user = userService.getUserByEid(eid);
        if (null == user) {
            throw new BizException("-1", "未查找到用户！");
        }
        return user;
    }

    @ApiOperation("Get User by id.")
    @GetMapping("/info/id/{id}")
    public User getUserById(@PathVariable("id") Long id,
                            @RequestAttribute(JwtAuthenticationInterceptor.JWT_USER) User currentUser) {
        logger.info("当前登录用户 : " + currentUser);
        User user = userService.getUserById(id);
        if (null == user) {
            throw new BizException("-1", "未查找到用户！");
        }
        return user;
    }
}
