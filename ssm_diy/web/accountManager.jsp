<%--
  Created by IntelliJ IDEA.
  User: JAVASM
  Date: 2019/8/21
  Time: 23:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="utf-8"/>
    <title>账户操作</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
    <style type="text/css">

    </style>
    <script src="js/jquery-3.4.1.min.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>
<div class="container" style="margin-top: 100px">

    <h4><a href="/account/finaAll" >点击查看所有账户(跳转页面列表显示)</a></h4> <hr/>
    <h4><a href="/account/finaAllJson" >点击查看所有账户(返回json)</a></h4> <hr/>
    <h3>账户操作 <small>添加</small></h3>
    <div style="margin-left: 20px">
        <form action="account/saveAccount" method="post" class="form-horizontal">
            <div class="form-group">账户名称：<input type="text" name="name"/></div>
            <div class="form-group">账户金额：<input type="text" name="money"></div>
            <button type="submit" class="btn btn-default">保存</button>
            <button type="reset" class="btn btn-default">重置</button>
        </form>
    </div>
</div>
</body>
</html>
