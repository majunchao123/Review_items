package com.bjpowernode.exception;

/**
 * ClassName:MyUserException
 * Package:com.bjpowernode.exception
 * Description: 描述信息
 *
 * @date:2022/3/9 0:33
 * @author:白白白
 */
public class MyUserException extends Exception {
    public MyUserException() {
        super();
    }

    public MyUserException(String message) {
        super(message);
    }
}
