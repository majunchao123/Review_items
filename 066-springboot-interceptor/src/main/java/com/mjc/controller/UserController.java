package com.mjc.controller;

import com.mjc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * ClassName:UserController
 * Package:com.mjc.controller
 * Description: 描述信息
 *
 * @date:2022/4/18 15:36
 * @author:白白白
 */
@Controller
public class UserController {

    @RequestMapping("user/login.do")
    public String loginDo(String userName,String passWord,HttpSession session){
        User user = new User();
        user.setUserName("mjc");
        user.setPassWord("123");
        if (userName.equals(user.getUserName())&&passWord.equals(user.getPassWord())){
            session.setAttribute("user",user);
            return "/user/myCenter";
        }else {
            return "/user/error";
        }
    }

    @RequestMapping("user/myCenter")
    @ResponseBody
    public String myCenter(HttpSession session){
        User user = (User) session.getAttribute("user");
        return "用户账号:"+user.getUserName()+"用户密码:"+user.getPassWord();
    }

    @RequestMapping("user/error")
    @ResponseBody
    public String error(){
        return "账号密码错误。。。。";
    }
}
