package com.bjpowernode.beans;

import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.Data;

/**
 * ClassName:Student
 * Package:com.bjpowernode.beans
 * Description: 描述信息
 *
 * @date:2022/2/27 7:17
 * @author:白白白
 */
@Data
public class Student {
    private int id;
    private String name;
    private int age;
    private String email;
}
