<%--
  Created by IntelliJ IDEA.
  User: 29413
  Date: 2022/3/28
  Time: 22:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="jquery/jquery-1.11.1-min.js"/>
    <script type="text/javascript">
        $(function () {

            $("#getCode").click(function () {



            })






        })

    </script>
</head>
<body>
<input id="phone" tabindex="1" placeholder="手机号/如果手机号换了那就gg" accesskey="n" type="text" autocomplete ="off">
<input id="getCode" name="getCode" class="codeButton" type="button" value="发送"  autocomplete ="off"/>

<br>
<input id="code" type="text" placeholder="验证码输入" tabindex="3">
<input id="checkCode"  type="button" value="检查"  autocomplete ="off"/>

</body>
</html>
