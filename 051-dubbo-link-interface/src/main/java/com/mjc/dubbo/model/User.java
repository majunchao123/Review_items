package com.mjc.dubbo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName:User
 * Package:com.mjc.dubbo.model
 * Description: 描述信息
 *
 * @date:2022/4/17 15:23
 * @author:白白白
 */
@Data
public class User implements Serializable {
    Integer age;
    String name;
    Integer id;

}
