package com.drafire.spring_boot.controller;

import com.drafire.spring_boot.dto.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdministratorController {
    @Autowired
    private Administrator administrator;

    @GetMapping("/get")
    public void getAdministrator(){
        System.out.println(administrator.toString());
    }
}
