package com.mjc.spring;

import static org.junit.Assert.assertTrue;

import com.mjc.spring.ch3.service.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {

    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ch3/applicationContext.xml");
        Student student = (Student) context.getBean("student01");
        System.out.println(student);


    }
}
