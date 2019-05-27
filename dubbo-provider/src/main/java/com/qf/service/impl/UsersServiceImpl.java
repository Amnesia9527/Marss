package com.qf.service.impl;

import com.qf.mapper.UsersMapper;
import com.qf.pojo.Users;
import com.qf.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired(required = false)
    UsersMapper usersMapper;
    public List<Users> getAllUsers() {
        return usersMapper.getAllUsers();
    }
}
