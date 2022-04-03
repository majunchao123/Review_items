package com.mjc.spring.ch1.service;

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
    @Component 注解相当于bean 会自动创建一个容器
    <bean id = "xxxx" class = "xxxxxx" >

   1.@Component(value = "myStudent")



   2.省略value
   @Component("myStudent")



   3.@Component 省略value  其中默认为类名的首字母小写
    @Component = @Component(value = "student")

  */






@Component(value = "myStudent")

public class Student {
    @Value(value = "马俊超")
    String name;
    @Value(value = "12345")
    int num;
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
