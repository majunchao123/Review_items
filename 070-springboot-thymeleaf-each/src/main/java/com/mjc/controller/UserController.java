package com.mjc.controller;

import com.mjc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring5.processor.SpringUErrorsTagProcessor;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * ClassName:UserController
 * Package:com.mjc.controller
 * Description: 描述信息
 *
 * @date:2022/4/19 21:39
 * @author:白白白
 */
@Controller
public class UserController {

    @RequestMapping("userList.do")
    public String userList(Model model){

        ArrayList<User> users = new ArrayList<>();
        User user;
        for (int i = 0; i <4 ; i++) {
           user =  new User();
           user.setName("mjc"+i);
           user.setId(i);
           user.setAge(20+i);
           users.add(user);
        }
        model.addAttribute("userList",users);
        return "userList";
    }

    @RequestMapping("userMap.do")
    public String userMap(Model model){

        HashMap<Integer, User> maps = new HashMap<>();
        User user;
        for (int i = 0; i <4 ; i++) {
            user =  new User();
            user.setName("mjc"+i);
            user.setId(i);
            user.setAge(20+i);
            maps.put(i,user);
        }
        model.addAttribute("maps",maps);
        return "userMap";
    }


    @RequestMapping("if.do")
    public String If(Model model){

        User user = new User();
        user.setId(13);
        user.setName("m");

        model.addAttribute("user",user);
        return "if";
    }



    @RequestMapping("inline.do")
    public String inline(Model model){
        model.addAttribute("msg","内敛表达式");
        return "inline";
    }



}
