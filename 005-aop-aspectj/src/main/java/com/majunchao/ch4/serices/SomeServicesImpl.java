package com.majunchao.ch4.serices;

import org.springframework.stereotype.Component;

/**
 * ClassName:SomeServicesImpl
 * Package:com.majunchao.ch1.serices
 * Description: 描述信息
 *
 * @date:2022/2/21 20:38
 * @author:白白白
 */
@Component
public class SomeServicesImpl implements SomeServices {
    @Override
    public void doSome(String name, int num) {
        System.out.println("目标类方法的执行");
    }

    @Override
    public void doOther() {
        System.out.println("==============doOther方法的执行=============");
    }
}
