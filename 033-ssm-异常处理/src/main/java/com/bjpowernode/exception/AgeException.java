package com.bjpowernode.exception;

/**
 * ClassName:AgeException
 * Package:com.bjpowernode.exception
 * Description: 描述信息
 *
 * @date:2022/3/9 0:33
 * @author:白白白
 */
//用户年龄有问题抛出的异常
public class AgeException extends MyUserException {
    public AgeException() {
        super();
    }

    public AgeException(String message) {
        super(message);
    }
}
