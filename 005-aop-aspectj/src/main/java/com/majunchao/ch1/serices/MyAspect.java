package com.majunchao.ch1.serices;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * ClassName:MyAspect
 * Package:com.majunchao.ch1.serices
 * Description: 描述信息
 *
 * @date:2022/2/21 20:40
 * @author:白白白
 */
@Component
@Aspect
public class MyAspect {

    @Before("execution(void do*(..))")
    public void myBefore(JoinPoint joinPoint){
        System.out.println("方法的签名："+joinPoint.getSignature());
        System.out.println("方法的名称："+joinPoint.getSignature().getName());
        Object[] args = joinPoint.getArgs();
        for (Object i :
                args) {
            System.out.println("参数："+i);
        }
        System.out.println("切面方法，在目标类之前添加时间方法"+new Date());

    }

}
