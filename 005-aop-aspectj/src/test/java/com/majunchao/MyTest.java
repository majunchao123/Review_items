package com.majunchao;

import com.majunchao.ch4.serices.SomeServices;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:Test
 * Package:com.majunchao
 * Description: 描述信息
 *
 * @date:2022/2/22 0:17
 * @author:白白白
 */
public class MyTest {
    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SomeServices someServices = (SomeServices) context.getBean("someServicesImpl");

        someServices.doOther();

    }
}
