<%--
  Created by IntelliJ IDEA.
  User: JAVASM
  Date: 2019/8/21
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8"/>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css"/>
    <style type="text/css">

    </style>
    <script src="/js/jquery-3.4.1.min.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript" src="/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">

    <table class="table table-hover">
        <thead>
            <tr>
                <th colspan="3" align="center"> 账户信息表 </th>
            </tr>
            <tr>
                <th><input type="checkbox" id="checkall"> </th>
                <th>编号</th>
                <th>姓名</th>
                <th>余额</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${accounts}" var="account" varStatus="vs">
            <tr>
                <td><input type="checkbox" ></td>
                <td>${vs.count}</td>
                <td>${account.name }</td>
                <td>${account.money }</td>
                <td>
                    <button class="btn btn-info btn-sm glyphicon glyphicon-edit" data-toggle="modal" data-target=".editmodal" onclick=""> 修改</button>
                    <button class="btn btn-warning btn-sm glyphicon glyphicon-trash"  onclick="showDeleteModal();"> 删除</button>
                </td>
            </tr>
        </c:forEach>
        </tbody>

    </table>
</div>
</body>
</html>
