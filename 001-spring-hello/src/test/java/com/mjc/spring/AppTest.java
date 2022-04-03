package com.mjc.spring;

import static org.junit.Assert.assertTrue;

import com.mjc.spring.ch1.bean.Student;
import com.mjc.spring.ch1.service.Hello;
import com.mjc.spring.ch1.service.impl.HelloImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    @Test
    public void test01() {
        HelloImpl hello = new HelloImpl();
        hello.hello();
    }

    @Test
    public void test02() {


        /**
         * spring默认创建对象的时间：在创建spring容器时创建所有的对象
         *ApplicationContext s = new ClassPathXmlApplicationContext(config);
         */

        //从spring容器中获取对象的方法
        //1.获取配置文件地址
        String config = "bean.xml";
        //2.applicationContext表示Spring容器，通过容器获取对象
        ApplicationContext s = new ClassPathXmlApplicationContext(config);

        //从容器中获取某个对象，要调用的方法
        //getBean("bean配置文件中 id ")
        Hello a = (Hello) s.getBean("helloService");
        a.hello();
    }


    @Test
    public void test03(){

        /**
         * 获取spring容器中java对象的信息
         *
         * 1. 容器中定义对象的数量
         *         int beanDefinitionCount = applicationContext.getBeanDefinitionCount();
         *
         * 2. 容器中定义对象的名称
         *         String[] names = applicationContext.getBeanDefinitionNames();
         *         for (String name :
         *                 names) {
         *             System.out.println(name);
         *
         */

        String config = "bean.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);

        //容器中定义对象的数量
        int beanDefinitionCount = applicationContext.getBeanDefinitionCount();

        System.out.println(beanDefinitionCount);
        //容器中定义对象的名称
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name :
                names) {
            System.out.println(name);
        }
    }



    @Test
    public void test04(){
        String config = "chaper1/applicationContext.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);

        Student student1 = (Student)context.getBean("Student1");

        System.out.println(student1);

    }


}
