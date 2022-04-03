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
 * @date:2022/3/4 6:17
 * @author:白白白
 */
public class TwoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int jiaozi = 30;
        int rice = 25;
        int Noodle = 10;

        Cookie[] cookies = request.getCookies();
        for (Cookie c :
                cookies) {
            
        }


    }
}
