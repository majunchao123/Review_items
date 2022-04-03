package com.bjpowernode.filter;

/**
 * ClassName:filter1
 * Package:com.bjpowernode.filter
 * Description: 描述信息
 *
 * @date:2022/3/6 5:48
 * @author:白白白
 */

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 具体作用：
 * 1.拦截http服务器，帮助http服务器检测合法性
 * 2.拦截服务器，对当前请求进行增强
 *
 *
 *
 * filter接口实现的开发步骤
 * 1.创建java实现filter接口
 * 2.重写filter接口dofilter方法
 * 3.web.xml将过滤器接口实现类注册到http服务器中
 *
 *
 */
public class filter1  implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        String age = servletRequest.getParameter("age");
        if (Integer.parseInt(age)<75){
            //放行就把请求响应对象 还给tomcat
            filterChain.doFilter(servletRequest,servletResponse);
        }else {
            servletResponse.setContentType("text/html;charset=utf-8");
            PrintWriter writer = servletResponse.getWriter();
            writer.write("<center><font style='color:red;font-size=40px'>大爷,珍爱生命。。。</font></center>");
        }


    }
}
