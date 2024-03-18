package com.org.integrationprojcet.redis;


import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StringRedisUtil {
    private final RedisTemplate<String, String> redisTemplate;

}
