package com.bjpowernode.mapper;

import com.bjpowernode.beans.Goods;

/**
 * ClassName:GoodsMapper
 * Package:com.bjpowernode.mapper
 * Description: 描述信息
 *
 * @date:2022/2/27 21:03
 * @author:白白白
 */
public interface GoodsMapper {
    int updateGoods(Goods goods);

    Goods selectGoods(int id);

}
