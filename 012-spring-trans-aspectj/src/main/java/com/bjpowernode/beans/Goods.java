package com.bjpowernode.beans;

import lombok.Data;

/**
 * ClassName:Goods
 * Package:com.bjpowernode.beans
 * Description: 描述信息
 *
 * @date:2022/2/27 20:33
 * @author:白白白
 */

@Data
public class Goods {
    private int id;
    private String name;
    private int amount;
    private int price;
}
