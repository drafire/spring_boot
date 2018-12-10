package com.drafire.spring_boot.controller;

import com.drafire.spring_boot.dto.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {
    @Autowired
    private Administrator administrator;

    @RequestMapping("/get")
    public void getAdministrator(){
        System.out.println(administrator.toString());
    }
}
