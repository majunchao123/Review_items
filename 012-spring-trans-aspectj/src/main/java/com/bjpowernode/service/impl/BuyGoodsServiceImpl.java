package com.bjpowernode.service.impl;

import com.bjpowernode.beans.Goods;
import com.bjpowernode.beans.Sale;
import com.bjpowernode.execp.NotEnoughException;
import com.bjpowernode.mapper.GoodsMapper;
import com.bjpowernode.mapper.SaleMapper;
import com.bjpowernode.service.BuyGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName:BuyGoodsServiceImpl
 * Package:com.bjpowernode.service.impl
 * Description: 描述信息
 *
 * @date:2022/2/27 21:13
 * @author:白白白
 */
@Service
public class BuyGoodsServiceImpl implements BuyGoodsService {
    @Autowired
    SaleMapper saleMapper;

    @Autowired
    GoodsMapper goodsMapper;



//    @Transactional(
//            propagation = Propagation.REQUIRED,
//            isolation = Isolation.DEFAULT,
//            readOnly = false,
//            rollbackFor = {
//                    NullPointerException.class,
//                    NotEnoughException.class
//            }
//
//    )
    @Override
    public void buy(int goodsId, int nums) {

        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        int i = saleMapper.insertSale(sale);

        Goods goods = goodsMapper.selectGoods(goodsId);
        if (goods ==null){
            throw new NullPointerException("编号"+goodsId+"商品不存在");
        }else if (goods.getAmount()<nums){
            throw new NotEnoughException("商品"+goodsId+"库存不足");
        }


        Goods goods1 = new Goods();
        goods1.setId(goodsId);
        goods1.setAmount(nums);
        goodsMapper.updateGoods(goods1);

    }
}
