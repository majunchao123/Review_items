package com.mjc.spring.ch2.service;

/**
 * ClassName:School
 * Package:com.mjc.spring.chaper1.service
 * Description: 描述信息
 *
 * @date:2022/2/19 22:15
 * @author:白白白
 */
public class School {
    String name;
    String address;


    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
