package com.bjpowernode.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
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
 * @date:2022/3/1 4:18
 * @author:白白白
 */
@Controller
public class IndexController {

    @RequestMapping("/test/index")
    public ModelAndView indexView(HttpServletRequest request,
                                  HttpServletResponse response,
                                  HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        //添加数据
        modelAndView.addObject("msg","接收modelanview"+request.getParameter("name"));
        modelAndView.addObject("fun","执行操作");

        //指定视图，指定视图路径跳转的
        modelAndView.setViewName("show");

        return modelAndView;
    }




}
