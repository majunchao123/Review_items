package com.bjpowernode.listener;

import javax.servlet.ServletContextAttributeEvent;

/**
 * ClassName:ServletContextAttributeListener
 * Package:com.bjpowernode.listener
 * Description: 描述信息
 *
 * @date:2022/3/6 4:14
 * @author:白白白
 */
public class ServletContextAttributeListener implements javax.servlet.ServletContextAttributeListener {
    /*新增共享数据*/
    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        System.out.println("");
    }
/*删除共享数据*/
    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {

    }

    /*更新共享数据*/
    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {

    }
}
