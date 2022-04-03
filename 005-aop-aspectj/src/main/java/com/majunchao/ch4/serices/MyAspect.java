package com.majunchao.ch4.serices;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
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

  /*  @Before("execution(void do*(..))")
    public void myBefore(JoinPoint joinPoint){
        System.out.println("方法的签名："+joinPoint.getSignature());
        System.out.println("方法的名称："+joinPoint.getSignature().getName());
        Object[] args = joinPoint.getArgs();
        for (Object i :
                args) {
            System.out.println("参数："+i);
        }
        System.out.println("切面方法，在目标类之前添加时间方法"+new Date());

    }*/



    @Before("mypt()")
    public void myBefore(){
        System.out.println("执行之前执行");
    }


    @AfterReturning(value = "mypt()",returning = "res")
    public void myAfter(Object res){
        System.out.println("执行之后");

    }

    /**
     *@Pointcut:管理切入点表达式
     *
     * 可以管理重复的切入点表达式
     * 用法：
     *      直接在切入点表达式位置加上方法名
     *
     */
    @Pointcut(value = "execution(* *..doOther(..))")
    public void mypt(){}





}
