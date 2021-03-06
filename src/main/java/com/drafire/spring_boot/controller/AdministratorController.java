package com.drafire.spring_boot.controller;

import com.drafire.spring_boot.dto.Administrator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@Api(value = "超级会员")
public class AdministratorController {
    @Autowired
    private Administrator administrator;

    @GetMapping("/get")
    @ApiOperation("查询超级会员")
    public String getAdministrator(){
        System.out.println(administrator.toString());
        return administrator.toString();
    }
}
