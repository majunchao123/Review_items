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
 * @date:2022/3/6 3:46
 * @author:白白白
 */

/**
 * httpRequest：
 * 介绍：
 * 1.同一个网站，使用【请求转发】，两个servlet共享一个请求协议包。因此共享
 *同一个对象。实现数据共享。
 * 2.在请求对象实现servlet共享时，称为【请求作用域对象】
 *
 */
public class OneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
