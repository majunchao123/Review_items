package com.bjpowernode.controller;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName:${NAME}
 * Package:${PACKAGE_NAME}
 * Description: 描述信息
 *
 * @date:2022/3/4 4:30
 * @author:白白白
 */

/**
 * cookie:
 *      原理：
 *      用户向网站申请，servlet创建一个存储用户相关信息的数据，将cookie写在响应头中
 *      当用户用同一个浏览器访问时 无条件的返回Cookie，共享数据。
 *
 */
public class OneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("key", "kjc");
        response.addCookie(cookie);
    }
}
