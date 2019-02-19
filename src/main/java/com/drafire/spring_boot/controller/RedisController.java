package com.drafire.spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Autowired
    private StringRedisTemplate redisTemplate;

    @GetMapping(value = "/redis/get/{key}")
    public Object getRedis(@PathVariable String key){
        Object object= redisTemplate.opsForValue().get(key);
        return object;
    }

    @GetMapping(value = "/redis/set/{key}/{value}")
    public Object setRedis(@PathVariable String key,@PathVariable String value){
        redisTemplate.opsForValue().set(key,value);
        return getRedis(key);
    }

    @GetMapping(value = "/redis/delete/{key}")
    public String deleteRedis(@PathVariable String key){
        redisTemplate.delete(key);
        return "ok";
    }
}
