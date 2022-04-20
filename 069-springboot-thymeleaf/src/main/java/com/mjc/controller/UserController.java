package com.mjc.controller;

import com.mjc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;

/**
 * ClassName:UserController
 * Package:com.mjc.controller
 * Description: 描述信息
 *
 * @date:2022/4/19 17:43
 * @author:白白白
 */
@Controller
public class UserController {

    @RequestMapping("url")
    public String url(Model model){

        model.addAttribute("id","12");
        model.addAttribute("name","mjc");
        model.addAttribute("age","13");
        return "url";
    }

    @RequestMapping("getUser")
    @ResponseBody
    public String getUser(Integer id,String name,Integer age){
        return "用户编号:"+id+"姓名:"+name+"年龄:"+age;
    }

    @RequestMapping("getUser2/{id}/{name}/{age}")
    @ResponseBody
    public String getUser2(@PathVariable("id") Integer id, @PathVariable("name") String name, @PathVariable("age") Integer age){
        return "用户编号:"+id+"姓名:"+name+"年龄:"+age;
    }

    @RequestMapping("jsinline.do")
    public String jslineDo(Model model){
        User user = new User();
        user.setName("田艺sb");
        model.addAttribute("user",user);
        return "jsinline";
    }

    @RequestMapping("index")
    public String index(Model model, HttpServletRequest request){
        User user = new User();
        user.setName("mjc");
        user.setId(12);
        user.setAge(16);
        model.addAttribute("user",user);
        request.setAttribute("userRequest",user);
        return "index";


    }

}
