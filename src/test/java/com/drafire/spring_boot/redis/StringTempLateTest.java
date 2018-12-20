package com.drafire.spring_boot.redis;

import com.drafire.spring_boot.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.Serializable;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StringTempLateTest {
    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private RedisTemplate<String,Serializable> redisCacheTemplate;

    @Test
    public void test() {
        String person = redisTemplate.opsForValue().get("person.age");
        System.out.println(person);
    }

    @Test
    public void test2(){
        String person = redisTemplate.opsForValue().get("person.age");
        if ("" == person||null==person) {
            redisTemplate.opsForValue().set("person.age", "21");
        }

        User cacheUser= (User) redisCacheTemplate.opsForValue().get("lisi");
        if(null==cacheUser){
            User user=new User();
            user.setId(2);
            user.setAmount(200);
            user.setName("lisi");

            redisCacheTemplate.opsForValue().set("lisi",user);
        }
    }

    @Test
    public void test3(){
        User cacheUser= (User)redisCacheTemplate.opsForValue().get("lisi");
        System.out.println(cacheUser);
    }
}
