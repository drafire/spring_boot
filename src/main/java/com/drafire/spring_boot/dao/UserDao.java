package com.drafire.spring_boot.dao;

import com.drafire.spring_boot.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    User getUser(int i);
}
