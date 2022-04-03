package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String indexView(String name,Integer age,Model model)  {
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        return "show";
    }
}
