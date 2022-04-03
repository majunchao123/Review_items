package com.bjpowernode.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * ClassName:${NAME}
 * Package:${PACKAGE_NAME}
 * Description: 描述信息
 *
 * @date:2022/3/5 23:29
 * @author:白白白
 */


/**
 * 1.介绍
 * 1).httpSession接口来自于servlet规范下的一个接口。实现类由http服务器替工
 * 。
 * 2).同一个网站，为同一个浏览器/用户提供服务，此时可以用httpsession对象进行数据共享
 *
 * 3).httpSession接口修饰的对象称为会话作用域对象
 *
 *
 * 2.httpSession与Cookie区别：
 *  1）存储位置：一个在天上，一个地上
 *
 *  cookie存储在客户端的计算机中
 *  httpSession存储在服务端计算机内存中
 *
 *
 *  2).数据类型：
 *  cookie：String类型
 *  httpSession：任意类型的共享数据Objetc
 *
 *  3）.数据数量
 *  cookie：一个cookie对象只能存储一个共享数据
 *  httpSession:HttpSession使用map集合存储共享数据，可以存储任意数量共享数据
 *
 *  4）参照物
 * cookie相当于客户在服务端的 【会员卡】
 * httpSession相当于客户在服务端的【私人保险柜】
 *
 *
 *
 *
 *
 *
 */
public class OneServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String goodsName = request.getParameter("goodsName");
        HttpSession session = request.getSession();
        Integer goodsNum = (Integer) session.getAttribute(goodsName);
        if (goodsNum==null){
            goodsNum = 1;
            session.setAttribute(goodsName,goodsNum);
        }else {
            session.setAttribute(goodsName,goodsNum+1);
        }
        request.getRequestDispatcher("/index.jsp").forward(request,response);

    }
}
