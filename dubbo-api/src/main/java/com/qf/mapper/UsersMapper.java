package com.qf.mapper;

import com.qf.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UsersMapper {
    @Select("select * from userinfo")
    public List<Users> getAllUsers();
}
