package com.mjc.controller;

import com.mjc.dubbo.model.User;
import com.mjc.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:UserController
 * Package:com.mjc.controller
 * Description: 描述信息
 *
 * @date:2022/4/17 17:34
 * @author:白白白
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("getUser")
    public String getUser(Model model, Integer id){

        User user = userService.getUserById(id);
        model.addAttribute("user",user);
        return "UserIndex";

    }





}
