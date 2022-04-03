package com.bjpowernode.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器：
 *  1).拦截器是springmvc中的一种，需要实现 HandlerInterceptor 接口
 *  2）. 拦截器 和过滤器相似 但侧重点不同
 *        拦截器 拦截用户的请求 ，请求做判断处理
 *        过滤器 过滤请求参数 设置字符集等工作
 *
 *   3）.拦截器是全局的 可以对多个controller进行拦截 一个项目中可以有多个
 *      拦截器 。
 *      拦截器常用于:用户的登陆处理，权限检查，记录日志等操作。
 */

/**
 * 实现步骤：
 * 1.自定义拦截器 实现HandlerInterceptor 接口
 * 2.重写接口中 三个方法
 * 3.springmvc中声明拦截器对象
 *
 */
public class MyInterceptor implements HandlerInterceptor {


    /**  preHandle:
     *      参数：
     *      Object handler :被拦截的控制器对象
     *      返回值  boolean
     *      true:可放行
     *      false:被拦截
     *
     *      特点：
     *      1.方法在被拦截的控制器之前先执行
     *      用户的请求先到达此处
     *
     *      2.可以获取请求的信息，验证请求是否符合要求
     *      验证用户的登录
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle执行");
        return true;
    }


    /**   postHandle:后处理方法
     *
     *
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandler");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion");
    }
}
