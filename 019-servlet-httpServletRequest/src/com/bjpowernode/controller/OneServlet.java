package com.bjpowernode.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName:${NAME}
 * Package:${PACKAGE_NAME}
 * Description: 描述信息
 *
 * @date:2022/3/3 17:06
 * @author:白白白
 */

/**
 *httpServletRequest作用：
 * 1.可以读取http请求协议包中[请求行]信息
 * 2.可以读取请求头信息 和 请求头的参数信息
 *get请求:tomcat负责进行解码，默认给UTF-8
 *
 * post请求：由request进行解码 默认【ISO-8859-1】
 *
 * 3.可以代替http服务器申请资源文件的调用
 */




public class OneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        //post请求默认字符编码为【ISO-8859-1】 改为UTF-8
        request.setCharacterEncoding("UTF-8");
        String password = request.getParameter("password");
        System.out.println("读取的参数："+password);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //通过请求对象读取请求头的参数
        String username = request.getParameter("username");
        System.out.println("读取的参数："+username);
    }
}
