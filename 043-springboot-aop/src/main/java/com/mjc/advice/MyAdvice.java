package com.mjc.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ClassName:MyAdvice
 * Package:com.mjc.advice
 * Description: 描述信息
 *
 * @date:2022/4/14 17:21
 * @author:白白白
 */
@Aspect
@Component
public class MyAdvice {

    @Pointcut("execution(* *..index(..))")
    public void mypt(){}



    @Around("mypt()")
    public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable {

       String name = "马俊超";
       String age = "14";

       //集合转为数组
        ArrayList<Object> list = new ArrayList<>();
        list.add(name);
        list.add(age);

        String[] strings = list.toArray(new String[list.size()]);
        Object proceed = joinPoint.proceed(strings);//目标方法执行
        return proceed;

    }
}
