package com.atguigu.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

@SpringBootTest
public class RedisTest {
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void test(){
        redisTemplate.opsForValue().set("哈克", "哈克学习是真卷啊");
        Object hake = redisTemplate.opsForValue().get("哈克");
        System.out.println("hake = " + hake);

        redisTemplate.opsForList().leftPush("0615","阿细" );
        redisTemplate.opsForList().leftPush("0615","哈克" );
        redisTemplate.opsForList().leftPush("0615","阿毅" );
        List range = redisTemplate.opsForList().range("0615", 0, -1);
        range.forEach(System.out::println);

    }
}
