package com.mjc.spring.ch2.service;

/**
 * ClassName:Student
 * Package:com.mjc.spring.chaper1.service
 * Description: 描述信息
 *
 * @date:2022/2/19 22:15
 * @author:白白白
 */
public class Student {
    String name;
    int num;
    School school;

    public Student(String name, int num, School school) {
        this.name = name;
        this.num = num;
        this.school = school;
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
