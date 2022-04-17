package com.mjc.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:Index
 * Package:com.mjc.controller
 * Description: 描述信息
 *
 * @date:2022/4/14 17:21
 * @author:白白白
 */
@Controller
public class Index {


    @RequestMapping("index")
    @ResponseBody
    public String index(String name,String age){


        return "姓名 :" +name+"年龄 : "+age;
    }
}
