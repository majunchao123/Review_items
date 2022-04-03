实现步骤：

1.创建数据库mysql
2.新建maven web项目

3.加入依赖
    springmvc spring mybatis三个框架依赖  mysql驱动 jackson依赖
    druid连接池 jdbc驱动 jsp servlet

 4.写web.xml
 1）注册DispatcherServlet  目的 ：1.创建springmvc容器,才能创建controller对象
                                2.创建servlet，接收用户请求
 2）注册spring监听器 ：ContextLoadListener ,目的 创建spring容器 才能创建service dao 对象

 3）注册字符集过滤器 解决post请求乱码问题


 5.创建包 controller service dao 实体类包


 6.写spring mvc配置
    1）.扫描controller包
    2).启动注解启动  作用： 1 ajax  2.解决静态资源问题
    3).声明静态资源处理器
    4).视图解析器
 spring配置
 1.扫描service包
 2.加载配置jdbc配置
 3.配置数据源driud连接池
 4.整合mybatis 创建SqlSessionFactory

5.配置Spring整合MyBatis，扫描包
   扫描 mapper包创建mapper对象


 mybatis配置
 写set 打印日志

 jdbc配置

 写代码
