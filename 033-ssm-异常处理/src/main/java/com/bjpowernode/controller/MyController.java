package com.bjpowernode.controller;

import com.bjpowernode.exception.AgeException;
import com.bjpowernode.exception.MyUserException;
import com.bjpowernode.exception.NameException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ClassName:MyController
 * Package:com.bjpowernode.controller
 * Description: 描述信息
 *
 * @date:2022/3/9 0:32
 * @author:白白白
 */
@Controller
public class MyController {



    @RequestMapping("some.do")
    public String indexView(String name,Integer age,Model model) throws MyUserException {
        if (!"zs".equals(name)){
            throw new NameException("姓名不正确，必须为zs");
        }
        if (age>80){
            throw new AgeException("年龄太大，请不要超过80岁");
        }
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        return "show";
    }
}
