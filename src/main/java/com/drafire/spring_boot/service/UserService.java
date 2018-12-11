package com.drafire.spring_boot.service;

import com.drafire.spring_boot.domain.User;
import com.mysql.jdbc.ServerPreparedStatement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@Service
public class UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User getUser(int id) {
        String sql = "select * from t_user where id=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(User.class));
    }
}
