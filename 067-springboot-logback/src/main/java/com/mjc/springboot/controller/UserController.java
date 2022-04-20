package com.mjc.springboot.controller;

import com.mjc.springboot.model.User;
import com.mjc.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * ClassName:UserController
 * Package:com.mjc.springboot.controller
 * Description: 描述信息
 *
 * @date:2022/4/19 10:16
 * @author:白白白
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;


    @RequestMapping("user/login.do")
    public String loginDo(String loginAct, String loginPwd, HttpServletRequest request){

        User user = userService.queryUserByLoginactAndLoginPwd(loginAct, loginPwd);
        if (user!=null){
            request.setAttribute("user",user);
            return "/myCenter";
        }
        return "redirect:/user/error.do";

    }

    @RequestMapping("user/error.do")
    @ResponseBody
    public String error(){

        return "密码错误，重新输入。。。。";
    }



}
