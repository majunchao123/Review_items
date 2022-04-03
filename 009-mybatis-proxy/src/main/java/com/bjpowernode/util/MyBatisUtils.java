package com.bjpowernode.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName:MyBatisUtils
 * Package:com.bjpowernode.util
 * Description: 描述信息
 *
 * @date:2022/2/23 6:30
 * @author:白白白
 */
public class MyBatisUtils {

    private static SqlSessionFactory factory = null;


    static {
        String config = "mybatis.xml";
        //2.读取这个config表示的文件
        try {
            InputStream in = Resources.getResourceAsStream(config);
            factory = new SqlSessionFactoryBuilder().build(in);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static SqlSession getSqlSession() {
        SqlSession sqlSession = null;
        if (factory != null) {
            sqlSession = factory.openSession();
        }
        return sqlSession;

    }


}
