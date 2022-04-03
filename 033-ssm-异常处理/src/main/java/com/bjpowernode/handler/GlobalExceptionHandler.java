package com.bjpowernode.handler;

/**
 * ClassName:Glo
 * Package:com.bjpowernode.handler
 * Description: 描述信息
 *
 * @date:2022/3/9 1:14
 * @author:白白白
 */

import com.bjpowernode.exception.AgeException;
import com.bjpowernode.exception.NameException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @ControllerAdvice :控制器增强(增加异常处理功能)
 *
 * 必须在springmvc中声明扫描包 配置组件扫描器
 */

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(AgeException.class)
    public String doAgeException(Exception e, Model model){

        model.addAttribute("msg","你的年龄大于80岁");
        model.addAttribute("e",e);
        return "errorAge";
    }
    @ExceptionHandler(NameException.class)
    public String doNameException(Exception e, Model model){

        model.addAttribute("msg","名字错误。。");
        model.addAttribute("e",e);
        return "errorName";
    }


    //处理其他异常
    @ExceptionHandler
    public String doOtherException(Exception e, Model model){

        model.addAttribute("msg","有其他错误，请重新检查页面..");
        model.addAttribute("e",e);
        return "default";
    }




}
