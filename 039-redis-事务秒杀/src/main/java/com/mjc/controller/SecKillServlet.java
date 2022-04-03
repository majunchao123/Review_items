package com.mjc.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

/**
 * ClassName:${NAME}
 * Package:${PACKAGE_NAME}
 * Description: 描述信息
 *
 * @date:2022/3/29 16:17
 * @author:白白白
 */
public class SecKillServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public SecKillServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userid = new Random().nextInt(50000) +"" ;
        String prodid =request.getParameter("prodid");

        boolean isSuccess=SecKill_redis.doSecKill(userid,prodid);
//        boolean isSuccess= SecKill_redisByScript.doSecKill(userid,prodid);
        response.getWriter().print(isSuccess);
    }

}

