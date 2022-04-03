package com.bjpowernode.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *httpServletResponse接口主要功能：
 *
 * 1.将执行结果以二进制形式写到响应体中
 *
 * 2.设置响应头中的【content-type】属性值，从而控制浏览器使用对应的
 * 编辑器将内容输入
 *
 *3.设置响应头中的[location]属性，将请求地址赋值给location，从而实现页面的跳转
 *  String result = "http://baidu.com";
 *         response.sendRedirect(result);
 *
 */
public class OneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String result = "hello";
//        String result2 = "马俊超<br/>可乐<br/>ty<br/>";
//
//        /*设置响应头中的编码器*/
//        response.setContentType("text/html;charset=utf-8");
//
//        PrintWriter writer = response.getWriter();
//        writer.write(result);
//        writer.write(result2);

        String result = "http://baidu.com";
        response.sendRedirect(result);


    }
}
