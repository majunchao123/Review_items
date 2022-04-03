package com.mjc.spring.ch1.service.impl;

import com.mjc.spring.ch1.service.Hello;

/**
 * ClassName:HelloImpl
 * Package:com.mjc.spring.chaper1.service.impl
 * Description: 描述信息
 *
 * @date:2022/2/19 2:54
 * @author:白白白
 */
public class HelloImpl implements Hello {
    @Override
    public void hello() {
        System.out.println("接口重写");
    }
}
