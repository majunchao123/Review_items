package com.majunchao.ch3.serices;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

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

//    @Before("execution(void do*(..))")
//    public void myBefore(JoinPoint joinPoint){
//        System.out.println("方法的签名："+joinPoint.getSignature());
//        System.out.println("方法的名称："+joinPoint.getSignature().getName());
//        Object[] args = joinPoint.getArgs();
//        for (Object i :
//                args) {
//            System.out.println("参数："+i);
//        }
//        System.out.println("切面方法，在目标类之前添加时间方法"+new Date());
//
//    }

    /**
     *后置通知方法
     * 1.公共方法 public
     * 2.无返回值 void
     * 3.方法名称自定义
     * 4.方法是有参数的，推荐是Object，参数名自定义
     */


    /**
     * @AfterReturning:后置通知
     *   属性：
     *   value：切入点表达式
     *   returning：值要与方法的形参名保持一致
     *
     *   特点：
     *   1.在目标方法执行之后运行
     *
     *   2.能够获取到目标方法的返回值
     *   Objetc res = doSome()
     *
     *   3.可以修改这个返回值
     *
     */


//    @AfterReturning(value = "execution(* *..doOther(..))",returning = "res")
//    public void afterRutning(Object res){
//
//        System.out.println("后置方法执行。。。。");
//        System.out.println("目标方法返回值："+res);
//
//
//    }

    /**
     * 环绕通知方法格式：
     * 1.public
     * 2.必须有一个返回值,推荐使用Object
     * 3.方法名称自定义
     * 4.方法有参数，固定参数 Process
     */

    /**
     * @Around :环绕通知
     *
     *    属性：value 切入点表达式
     *
     * 特点：
     * 1.功能最强的通知
     * 2.方法前后都能增强
     * 3.并且能控制目标方法的执行
     *  4.能够改变目标方法的执行结果。
     *
     *
     *
     *
     * 环绕通知等同于 JDK动态代理 InvocationHandler接口
     *
     * 参数： ProceedingJoinPoint 就等同于Method
     * 返回值：就是目标方法的执行结果。可以被修改
     *
     * 环绕通知:经常做事务。
     *
     *
     */



    @Around(value = "execution(* *..doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("在环绕通知之前执行,加方法。。。。。。。");
        Object result= pjp.proceed();
        if (result!=null){
            result = "mjc";
        }
        System.out.println("再环绕通知之后 执行事务操作。。。");
        return result;


    }


}
