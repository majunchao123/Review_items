package com.mjc.spring.ch1.bean;

/**
 * ClassName:Student
 * Package:com.mjc.spring.chaper1.bean
 * Description: 描述信息
 *
 * @date:2022/2/19 20:24
 * @author:白白白
 */
public class Student {
    String name;
    int num;

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
                '}';
    }
}
