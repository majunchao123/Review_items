package com.bjpowernode.execp;

/**
 * ClassName:NotEnoughExecption
 * Package:com.bjpowernode.execp
 * Description: 描述信息
 *
 * @date:2022/2/27 21:18
 * @author:白白白
 */
public class NotEnoughException extends RuntimeException {

    public NotEnoughException() {
        super();
    }

    public NotEnoughException(String message) {
        super(message);
    }
}
