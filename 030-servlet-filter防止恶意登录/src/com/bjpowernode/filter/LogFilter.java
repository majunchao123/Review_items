package com.bjpowernode.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * ClassName:LogFilter
 * Package:com.bjpowernode.filter
 * Description: 描述信息
 *
 * @date:2022/3/7 4:43
 * @author:白白白
 */


public class LogFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        /*
        * uri:获取的是【网站名/资源文件名.....】
        * */
        String uri = request.getRequestURI();
        if (uri.indexOf("login")!=-1||"/myWeb/".equals(uri)){
            filterChain.doFilter(request,response);
            return;
        }
        HttpSession session = request.getSession(false);
        if (session!=null){
            filterChain.doFilter(request,response);
            return;
        }

        //拒绝返回登陆页面
        response.sendRedirect("login.jsp");
    }
}
