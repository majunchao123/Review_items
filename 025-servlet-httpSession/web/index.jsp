<%--
  Created by IntelliJ IDEA.
  User: 29413
  Date: 2022/3/5
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>


  <table border="2" align="center">
    <tr>
      <td>商品名称</td>
      <td>商品单价</td>
      <td>供应商</td>
      <td>放入购物车</td>
    </tr>
    <tr>
      <td>华为笔记本电脑</td>
      <td>7000</td>
      <td>华为</td>
      <td><a href="/one?goodsName=华为笔记本电脑">放入购物车</a></td>
    </tr>
    <tr>
      <td>榴莲</td>
      <td>300</td>
      <td>水果商</td>
      <td><a href="/one?goodsName=榴莲">放入购物车</a></td>
    </tr>
    <tr>
      <td>女士内裤</td>
      <td>50</td>
      <td>田艺</td>
      <td><a href="/one?goodsName=女士内裤">放入购物车</a></td>
    </tr>
    <tr align="center">
      <td colspan="4">
        <a href="/two">查看我的购物车</a>
      </td>

    </tr>
  </table>


  </body>
</html>
