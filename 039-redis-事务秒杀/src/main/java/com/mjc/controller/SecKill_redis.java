package com.mjc.controller;

import com.mjc.common.JedisPoolUtil;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Transaction;

import java.io.IOException;
import java.util.List;

/**
 * ClassName:SecKill_redis
 * Package:com.mjc.controller
 * Description: 描述信息
 *
 * @date:2022/3/29 16:24
 * @author:白白白
 */
public class SecKill_redis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.19.130", 6379);
        System.out.println(jedis.ping());
        jedis.close();
    }

    //秒杀过程
    public static boolean doSecKill(String uid, String prodid) throws IOException {
        //1 uid和prodid非空判断
        if (uid==null || prodid==null ){
        return false;
        }

        //2 连接redis
        JedisPool jedisPoolInstance = JedisPoolUtil.getJedisPoolInstance();
        Jedis jedis = jedisPoolInstance.getResource();

        //3 拼接key
        // 3.1 库存key
        String kcKey = "kc"+prodid;
        // 3.2 秒杀成功用户key
        String userKey = "user"+uid;
        //4 获取库存，如果库存null，秒杀还没有开始
        jedis.watch(kcKey);

        String kc = jedis.get(kcKey);
        if (kc==null){
            System.out.println("秒杀还没开始");
            jedis.close();
            return false;
        }
        // 5 判断用户是否重复秒杀操作
        if (jedis.sismember(userKey,uid)){
            System.out.println("已经秒杀成功了，不能重复秒杀");
            jedis.close();
            return false;
        }

        //因为kc为字符串，所以先转换城integer类型的
        int i = Integer.parseInt(kc);
        //6 判断如果商品数量，库存数量小于1，秒杀结束
        if (i<1){
            System.out.println("秒杀结束");
            jedis.close();
            return false;
        }


        //添加事务
        Transaction multi = jedis.multi();
        multi.decr(kcKey);
        multi.sadd(userKey,uid);


        List<Object> results = multi.exec();
        if (results==null || results.size()==0){
            System.out.println("秒杀失败了");
            jedis.close();
            return false;
        }

        System.out.println("秒杀成功了..");
        jedis.close();
        return true;

    }
}
