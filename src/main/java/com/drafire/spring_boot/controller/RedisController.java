package com.drafire.spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
public class RedisController {
    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping(value = "/redis/get")
    public Object getRedis(String key){
        Object object= redisTemplate.opsForValue().get(key);
        return object;
    }

    @GetMapping(value = "/redis/set")
    public Object setRedis(String key,String value){
        redisTemplate.opsForValue().set(key,value);
        return getRedis(key);
    }

    @GetMapping(value = "/redis/delete")
    public Object deleteRedis(String key){
        redisTemplate.opsForValue().set(key,null);
        return getRedis(key);
    }
}
