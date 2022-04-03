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
 * @date:2022/3/3 11:57
 * @author:白白白
 */
public class TwoServlet extends HttpServlet {
    public TwoServlet() {
        System.out.println("TwoServlet对象被创建");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("TwoServletdo get方法 is run 。。。");
    }
}
