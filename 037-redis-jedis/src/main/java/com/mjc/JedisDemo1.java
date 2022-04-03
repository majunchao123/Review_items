package com.mjc;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import java.util.List;
import java.util.Set;

/**
 * ClassName:jedis
 * Package:com.mjc
 * Description: 描述信息
 *
 * @date:2022/3/28 20:55
 * @author:白白白
 */
public class JedisDemo1 {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.19.130", 6379);

        Set<String> keys = jedis.keys("*");
        for (String s :
                keys) {
            System.out.println(s);
        }
    }

    @Test
    public void test01(){
        Jedis jedis = new Jedis("192.168.19.130", 6379);
        String loginRoot = jedis.set("loginRoot", "12");
        Long loginRoot1 = jedis.incr("loginRoot");
        System.out.println(loginRoot1);
    }



    //操作list
    @Test
    public void test02(){
        Jedis jedis = new Jedis("192.168.19.130", 6379);
        jedis.rpush("username","马俊超","田艺","可乐");

        List<String> username = jedis.lrange("username", 0, -1);
        for (String s :
                username) {
            System.out.println(s);
        }
    }
}
