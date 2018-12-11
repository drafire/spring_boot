package com.drafire.spring_boot.controller;

import com.drafire.spring_boot.domain.User;
import com.drafire.spring_boot.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(description = "用户操作api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/get")
    @ApiOperation("通过id获取用户信息")
    public User getUser(int id) {
        return userService.getUserByMapper(id);
    }
}
