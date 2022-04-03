package com.bjpowernode.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * ClassName:ContextListener
 * Package:com.bjpowernode.listener
 * Description: 描述信息
 *
 * @date:2022/3/6 4:08
 * @author:白白白
 */

/**
 * 作用：
 * 通过这个接口可以检测全局作用域对象的创建和销毁时机
 */

public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
