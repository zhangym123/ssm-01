<%--
  Created by IntelliJ IDEA.
  User: 张艳敏
  Date: 2017/8/18
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>查询页面</title>
</head>
<body>
<a href="<%=request.getContextPath()%>/user/toAddUser.jhtml">新增</a>
<table border="1">
  <tr>
    <td>id</td>
    <td>账号</td>
    <td>操作</td>
  </tr>
  <c:forEach items="${list}" var="l">
    <tr>
      <td>${l.userId}</td>
      <td>${l.userAccount}</td>
      <td>
        <a href="<%=request.getContextPath()%>/user/huiXianById.jhtml?userId=${l.userId}">修改</a>
        <a href="<%=request.getContextPath()%>/user/deleteUserById.jhtml?userId=${l.userId}">删除</a>
      </td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
