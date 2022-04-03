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
 * @date:2022/3/4 6:11
 * @author:白白白
 */
public class OneServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username, money;


        username = request.getParameter("username");
        money = request.getParameter("money");

        Cookie cookie1 = new Cookie("username", username);
        Cookie cookie2 = new Cookie("money", money);


        response.addCookie(cookie1);
        response.addCookie(cookie2);
        request.getRequestDispatcher("/index2.html").forward(request,response);

    }
}
