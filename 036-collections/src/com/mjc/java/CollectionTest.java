package com.mjc.java;

import com.sun.corba.se.impl.orbutil.CorbaResourceUtil;
import org.junit.Test;

import java.lang.reflect.AccessibleObject;
import java.util.*;

/**
 * ClassName:CollectionTest
 * Package:com.mjc.java
 * Description: 描述信息
 *
 * @date:2022/3/24 15:01
 * @author:白白白
 */
public class CollectionTest {

    @Test
    public void test01() {
        Collection coll = new ArrayList<>();
        coll.add(new Person("mjc", "20"));
        coll.add(123);
        coll.add(345);
        System.out.println(coll);
        System.out.println(coll.contains(new Person("mjc", "20")));

        List<Integer> coll1 = Arrays.asList(123, 456);
        coll.removeAll(coll1);
        System.out.println(coll);
    }

    @Test
    public void test02(){
        List linkedList = new LinkedList<>();

        linkedList.add(123);
        linkedList.add(456);
        linkedList.add(new Person("mjc","12"));
        linkedList.add("mjc");
        System.out.println(linkedList);

    }




    @Test
    public void test03(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("123",456);
        map.put("456",46);
        map.put("mjc","马俊超");
        System.out.println(map);
        System.out.println(map.entrySet());
    }
    @Test
    public void test04(){


    }


}
