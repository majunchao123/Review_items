package com.mjc.java.handler;

import com.mjc.java.util.ServicesTools;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ClassName:MyHandler
 * Package:com.mjc.java.handler
 * Description: 描述信息
 *
 * @date:2022/2/21 2:39
 * @author:白白白
 */
public class MyHandler implements InvocationHandler {
    Object target = null;

    public MyHandler(Object target) {

        this.target = target;
    }


    //代理类要增加的功能
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        ServicesTools.doDate();

        //目标类要执行的方法
        Object res = method.invoke(target, args);

        ServicesTools.doTime();

        return res;

    }
}
