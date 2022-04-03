package com.mjc.spring;

import static org.junit.Assert.assertTrue;

import com.mjc.spring.ch2.service.School;
import com.mjc.spring.ch2.service.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ch1/applicationContext.xml");
        School school = (School) context.getBean("school");
        System.out.println(school);

    }

    @Test
    public void test02() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ch2/applicationContext.xml");

        Student student = (Student) context.getBean("student");

        System.out.println(student);
    }


}
