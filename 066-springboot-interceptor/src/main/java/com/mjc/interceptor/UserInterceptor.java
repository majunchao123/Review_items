package com.mjc.interceptor;

import com.mjc.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ClassName:UserInterceptor
 * Package:com.mjc.interceptor
 * Description: 描述信息
 *
 * @date:2022/4/18 15:19
 * @author:白白白
 */
public class UserInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("被拦截！！！！！！");
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            //重定向
            response.sendRedirect(request.getContextPath() + "/user/error");
            return false;
        }
        return true;
    }
}
