package com.mjc;

import redis.clients.jedis.Jedis;

import java.util.Random;

/**
 * ClassName:LoginDemo
 * Package:com.mjc
 * Description: 描述信息
 *
 * @date:2022/3/28 22:32
 * @author:白白白
 */
public class LoginDemo {
    public static void main(String[] args) {

        verifyCode("131",getRandomNum());
        //checkCode("131","428464");

    }

    //验证码检验
    public static void checkCode(String phone,String code){
        Jedis jedis = new Jedis("192.168.19.130", 6379);
        String codeKey = phone+"code";

        String redisCode = jedis.get(codeKey);
        if (code.equals(redisCode)){
            System.out.println("检验成功");
        }else {
            System.out.println("失败");
        }
    }
    //每个手机每天只能发送三次 ，验证码放到redis中 设置过期时间
    public static void verifyCode(String phone,String code){
        Jedis jedis = new Jedis("192.168.19.130", 6379);

        String countKey =phone+"count";
        String codeKey = phone+"code";

        String countNum = jedis.get(countKey);

        if (countNum==null){
            jedis.setex(countKey,24*60*60*60,"1");
            jedis.setex(codeKey,24*60*60*60,code);
        }else if (Integer.parseInt(countNum)<=2){
            jedis.incr(countKey);
            jedis.expire(countKey,24*60*60*60);
            jedis.setex(codeKey,24*60*60*60,code);
        }else {
            System.out.println("你的手机号超过三次，请明天再试");
        }
    }


    //随机生成6位数验证码
    public static String getRandomNum() {
        Random random = new Random();
        String num = "";
        for (int i = 0; i < 6; i++) {
            int i1 = random.nextInt(10);
            num += i1;
        }
        return num;
    }
}
