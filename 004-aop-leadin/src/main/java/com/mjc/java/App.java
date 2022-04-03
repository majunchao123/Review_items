package com.mjc.java;

import com.mjc.java.handler.MyHandler;
import com.mjc.java.service.SomeServices;
import com.mjc.java.service.impl.SomeServicesImpl;

import java.lang.reflect.Proxy;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //创建目标类
        SomeServicesImpl someServices = new SomeServicesImpl();

        //把需要代理的目标类对象 赋值给Handler
        MyHandler myHandler = new MyHandler(someServices);

        //创建代理类
        SomeServices s = (SomeServices) Proxy.newProxyInstance(someServices.getClass().getClassLoader(),
                someServices.getClass().getInterfaces(),
                myHandler);

        //这个doSome()就是执行Handler中的invoke()方法
        s.doSome();

    }
}
