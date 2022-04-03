package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * ClassName:IndexController
 * Package:com.bjpowernode.controller
 * Description: 描述信息
 *
 * @date:2022/3/7 11:28
 * @author:白白白
 */
@Controller
public class IndexController {

    @RequestMapping("/indexView")
   public String Index(Model model){
        model.addAttribute("msg","你好，大爷");
        model.addAttribute("fun","fbdsajkfbjsdkb");
        return "show";


    }
}