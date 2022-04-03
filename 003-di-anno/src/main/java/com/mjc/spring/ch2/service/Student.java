package com.mjc.spring.ch2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * ClassName:Student
 * Package:com.mjc.spring.chaper1.service
 * Description: 描述信息
 *
 * @date:2022/2/19 22:15
 * @author:白白白
 */

/*
     引用类型
     @Autowired：给引用类型赋值，支持byName，byType，自动注入原理
     默认使用byType类型

     1.byName方法
        使用步骤：1）在属性上面加上@Autowired
                2） 然后加上  @Qualifier


 */
@Component
public class Student {
    @Value(value = "马俊超")
    String name;
    @Value(value = "12345")
    int num;
    @Autowired
    @Qualifier(value = "school")
    School school;


    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", school=" + school +
                '}';
    }
}
