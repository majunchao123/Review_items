package com.mjc.springboot.controller;

import com.mjc.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName:UserController
 * Package:com.mjc.springboot.controller
 * Description: 描述信息
 *
 * @date:2022/4/16 16:54
 * @author:白白白
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;


    @RequestMapping("getCount")
    @ResponseBody
    public String getCount(){
        Integer count = (Integer) redisTemplate.opsForValue().get("count");

        if (count==null){
             count = userService.getCountAllUser();
             redisTemplate.opsForValue().set("count",count);
        }

        return "用户数量是:"+count+"个" ;
    }



}
