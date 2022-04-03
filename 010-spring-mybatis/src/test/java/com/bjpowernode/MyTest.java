package com.bjpowernode;

import com.bjpowernode.beans.Student;
import com.bjpowernode.service.StuServices;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:MyTest
 * Package:com.bjpowernode
 * Description: 描述信息
 *
 * @date:2022/2/27 7:47
 * @author:白白白
 */
public class MyTest {

    @Test
    public void test01(){
        String config="applicationContext.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
        String[] names = context.getBeanDefinitionNames();
        for (String name :
                names) {
            System.out.println("容器成员名称：" +name);
        }
    }


    @Test
    public void test02(){
        String config="applicationContext.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
        StuServices stuServices =  (StuServices)context.getBean("stuServicesImpl");
        int i = stuServices.queryStuCount();
        System.out.println(i);
    }


    @Test
    public void test03(){
        String config="applicationContext.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
        StuServices stuServices =  (StuServices)context.getBean("stuServicesImpl");
        Student student = new Student();
        student.setId(8);
        student.setAge(78);
        student.setEmail("12313");
        student.setName("刘备");
        int i = stuServices.insertStudent(student);



    }

}
