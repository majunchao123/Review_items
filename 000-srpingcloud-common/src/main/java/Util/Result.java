package Util;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:Result
 * Package:Util
 * Description: 描述信息
 *
 * @date:2022/1/15 10:35
 * @author:白白白
 */

public class Result extends HashMap {

    public static Result ok(){
        Result result = new Result();
        result.put("code",0);
        result.put("msg","请求成功");
        return result;
    }

    public static Result ok(Map<String,Object> hashmap){
        Result result = new Result();
        result.putAll(hashmap);
        return result;
    }

    public static Result ok(Integer code,String msg){
        Result result = new Result();
        result.put("code",code);
        result.put("msg",msg);
        return result;
    }

    public static<T> Result ok(Integer code,String msg,T data){
        Result result = new Result();
        result.put("code",code);
        result.put("msg",msg);
        result.put("data",data);
        return result;
    }









}
