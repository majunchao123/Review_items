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
 * @date:2022/3/3 21:04
 * @author:白白白
 */

/**
 * 重定向
 * response.sendRedirect("two");
 *
 * 特征：
 * 1.请求地址：既可以把当前网站内部资源地址发送给游览器(/网站名/资源文件名)
 *            也可以把其他网站资源地址发送浏览器(http://ip地址:端口号/网站名/资源文件名)
 *
 *
 *
 * 2.请求次数
 * 浏览器至少发送2此请求，第一次是用户自己发送，后续都是浏览器自动发送
 *
 *
 *缺点：需要在浏览器和服务器来回多次，增加了用户等待时间。
 *
 *
 */


public class OneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("写作业");
       request.getRequestDispatcher("/two").forward(request,response);

    }
}
