package com.drafire.spring_boot.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdministratorControllerTest {

    @Autowired
    private AdministratorController controller;

    @Test
    public void getAdministrator() {
        controller.getAdministrator();
    }
}