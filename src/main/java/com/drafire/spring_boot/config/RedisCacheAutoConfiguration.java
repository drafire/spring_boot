package com.drafire.spring_boot.config;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.io.Serializable;

/**
 * 定义一个支持序列化的template。默认只有StringRedisTemplate
 */
@Configuration
@AutoConfigureAfter(RedisCacheAutoConfiguration.class)
public class RedisCacheAutoConfiguration {
    //注意的是，这里如果是用Lettuce 的话，会报不能自动注入，可能是springboot 的版本问题导致
    @Bean(name = "redisCacheTemplate")
    public RedisTemplate<String,Serializable> redisCacheTemplate(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<String,Serializable> redisTemplate=new RedisTemplate<>();
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        return redisTemplate;
    }
}
