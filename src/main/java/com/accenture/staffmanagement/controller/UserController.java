package com.accenture.staffmanagement.controller;

import com.accenture.staffmanagement.entity.User;
import com.accenture.staffmanagement.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation("Get User by Eid.")
    @GetMapping(value = "/info/eid/{eid}", produces = "application/json;charset=utf-8")
    public User login(@PathVariable("eid") String eid) {
        return userService.getUserByEid(eid);
    }

    @ApiOperation("Get User by id.")
    @GetMapping(value = "/info/id/{id}", produces = "application/json;charset=utf-8")
    public User getUserInfo(@PathVariable("id") long id) {
        return userService.getUserById(id);
    }
}
