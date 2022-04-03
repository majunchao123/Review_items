package com.bjpowernode.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName:MyServlet
 * Package:com.bjpowernode.controller
 * Description: 描述信息
 *
 * @date:2022/3/3 10:08
 * @author:白白白
 */


/**
 * HttpServlet抽象类的作用：
 *  降低接口实现类对接口实现的难度，将接口中的不需要实现的方法交给抽象类去实现。
 *
 *
 *  servlet接口：
 *              init
 *              getServletConfig
 *              getServletInfo
 *              destroy
 *              service(有用)
 *
 *
 * 父类httpServlet已经把service实现好了
 *    tomcat在启动时：
 *    MyServlet m =  new MyServlet();
 *    m.service();
 *
 *
 *      我们只需要重写dopost doget方法 servie()这个方法会自己调用
 */


public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("执行doGet方法");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("执行dopost方法");
    }
}
