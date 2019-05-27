package com.qf.controller;

import com.qf.pojo.Users;
import com.qf.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {
    @Autowired(required = false)
    UsersService usersService;
    @RequestMapping("szt")
    public List<Users> getAllUsers(){
       return usersService.getAllUsers();
    }
}
