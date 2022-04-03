package com.bjpowernode;

import static org.junit.Assert.assertTrue;

import com.bjpowernode.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void shouldAnswerWithTrue() {
        String config = "applicationContext.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
        BuyGoodsService buyGoodsService = (BuyGoodsService) context.getBean("buyGoodsServiceImpl");

        /*动态代理对象：com.sun.proxy.$Proxy19*/
        System.out.println("代理"+buyGoodsService.getClass().getName());
        buyGoodsService.buy(1001,10);
    }
}
