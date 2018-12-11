package com.drafire.spring_boot.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void getUser() {
        System.out.println(userService.getUser(2));
    }

    @Test
    public void getUserByMapper() {
        System.out.println(userService.getUserByMapper(2));
    }
}