package com.mjc.spring.ch2.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * ClassName:School
 * Package:com.mjc.spring.chaper1.service
 * Description: 描述信息
 *
 * @date:2022/2/19 22:15
 * @author:白白白
 */



@Component
public class School {
    @Value("北京大学")
    String name;
    @Value("北京海淀区")
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
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
