package com.mjc.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * ClassName:IndexController
 * Package:com.mjc.springboot.controller
 * Description: 描述信息
 *
 * @date:2022/4/19 15:52
 * @author:白白白
 */
@Controller
public class IndexController {

    @RequestMapping("index.do")
    public String indexView(HttpServletRequest request, Model model){
        request.setAttribute("msg","你好帅可乐！！！！");
        model.addAttribute("ttt","123");
        return "index";
    }
}
