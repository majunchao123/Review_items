package com.mjc;
import com.alibaba.fastjson.JSONObject;
import com.mjc.utils.HttpUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:test
 * Package:com.mjc
 * Description: 描述信息
 *
 * @date:2022/4/28 20:40
 * @author:白白白
 */
public class test {
    public static void main(String[] args) {
        String host = "https://zidv2.market.alicloudapi.com";
        String path = "/idcheck/Post";
        String method = "POST";
        String appcode = "37958a6485b34dc0addc503d5cb9f16b";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();
        bodys.put("cardNo", "420983199806133216");
        bodys.put("realName", "马俊超");
        try {
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            System.out.println(response.toString());
            //获取response的body
            System.out.println(EntityUtils.toString(response.getEntity()));
            String s = EntityUtils.toString(response.getEntity());
            JSONObject jsonObject = JSONObject.parseObject(s);
            System.out.println(jsonObject);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
