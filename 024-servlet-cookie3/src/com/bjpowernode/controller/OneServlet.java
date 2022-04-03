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
 * @date:2022/3/5 23:02
 * @author:白白白
 */

/**
 *
 * cookie的销毁时间
 * 1.在默认情况下，cookie对象存放在浏览器缓存中
 * 只要浏览器关闭cookie就会销毁
 *
 *
 * 2.手动设置cookie存活在硬盘中。关闭浏览器也不会导致cookie清除。
 * 时间到就会从硬盘上清除。
 * cookie.setMaxAge(60) //cookie在硬盘中存放的时间
 *
 */



public class OneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
