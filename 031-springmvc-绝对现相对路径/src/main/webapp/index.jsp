<%--
  Created by IntelliJ IDEA.
  User: 29413
  Date: 2022/3/7
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    地址分类：
1.绝对地址:带有协议名称的地址，比如:http://www.baidu.com
2.相对地址:没有协议开头的地址，例如: user/some.do
    相对地址不能直接使用，必须有参考地址+相对地址才能得到指定资源


    3.参考地址

    地址：http://localhost:8080/springmvc/index.jsp
    路径：http://localhost:8080/springmvc
    资源：index.jsp



    1)页面不加"/"   indexView
    访问的是： 当前的路径+indexVew   http://localhost:8080/springmvc/indexView


    2)页面加 "/"   /user/some.do
    访问的是：协议+端口号    http://localhost:8080/indexView
    解决方案：加EL表达式
    <a href="${pageContext.request.contextPath}/indexView">发起链接地址</a>

总结 ：前端页面不加/ 不会带applicationContext路径



问题： 当页面 http://localhost:8080/user/index.jsp

       访问 user/some.do   得到的是http://localhost:8080/user/user/some.do


       解决方法:
       1.base标签(动态base标签)

       2.EL表达式


--%>
<a href="${pageContext.request.contextPath}/indexView">发起链接地址</a>
</body>
</html>
