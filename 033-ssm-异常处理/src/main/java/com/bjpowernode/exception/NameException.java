package com.bjpowernode.exception;

/**
 * ClassName:NameException
 * Package:com.bjpowernode.exception
 * Description: 描述信息
 *
 * @date:2022/3/9 0:43
 * @author:白白白
 */
//姓名有问题抛出的异常
public class NameException extends MyUserException {
    public NameException() {
        super();
    }

    public NameException(String message) {
        super(message);
    }
}
