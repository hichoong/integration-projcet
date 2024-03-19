package com.org.integrationprojcet.redis;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class RedisUtil {
    private final RedisTemplate<String, String> stringRedisTemplate;

    public void addString(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }

    public String getString(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    public Map<String, String> getAllList() {
        Map<String, String> getAllList = new HashMap<>();
        for (String key : stringRedisTemplate.keys("*")) {
            String value = stringRedisTemplate.opsForValue().get(key);
            getAllList.put(key, value);
        }
        return getAllList;
    }
}
