package com.mjc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mjc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:UserController
 * Package:com.mjc.controller
 * Description: 描述信息
 *
 * @date:2022/4/17 22:15
 * @author:白白白
 */
@Controller
public class UserController {
    @Reference(interfaceClass = UserService.class,version = "1.0.0",check = false,timeout = 15000)
    UserService userService;


    @RequestMapping("/getUserCount")
    @ResponseBody
    public String getUserCount(){

        return "总数："+userService.getAllUserCount();

    }


}
