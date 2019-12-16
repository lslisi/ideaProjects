package com.example.springbootredis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.springbootredis.service.RedisService;

@RestController
public class DemoController {


    @Autowired
    private RedisService redisService ;


    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String demoTest(){
        redisService.set("1","value22222");
        return redisService.get("1").toString();
    }

}
