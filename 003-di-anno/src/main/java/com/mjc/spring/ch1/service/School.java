package com.mjc.spring.ch1.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import sun.awt.SunHints;

/**
 * ClassName:School
 * Package:com.mjc.spring.chaper1.service
 * Description: 描述信息
 *
 * @date:2022/2/19 22:15
 * @author:白白白
 */

/*
    @value：简单类型属性赋值
    属性： value 是String类型。
    位置：1.直接在属性上面，value = "xxxx"
         2.在set方法上面赋值
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
