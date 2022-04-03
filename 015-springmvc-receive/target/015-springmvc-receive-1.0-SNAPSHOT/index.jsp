<%--
  Created by IntelliJ IDEA.
  User: 29413
  Date: 2022/3/2
  Time: 4:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function(){
            $("button").click(function(){
                $.ajax({
                    //url:"returnVoid-ajax.do",
                    //url:"returnStudentJsonArray.do",
                    url:"ajaxdo1",
                    data:{
                        name:"zhangsan",
                        age:20
                    },
                    type:"post",
                    dataType:"json",
                    success:function(resp){
                        //resp从服务器端返回的是json格式的字符串 {"name":"zhangsan","age":20}
                        //jquery会把字符串转为json对象， 赋值给resp形参。

                        // [{"name":"李四同学","age":20},{"name":"张三","age":28}]
                        alert(resp.name + "    "+resp.age);

                        /*$.each(resp,function(i,n){
                            alert(n.name+"   "+n.age)
                        })*/
                        // alert("返回的是文本数据："+resp);

                    }
                })
            })
        })
    </script>
</head>
<body>

<button id="btn">发起ajax请求</button>
</body>
</html>
