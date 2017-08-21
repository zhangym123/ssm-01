
<%--
  Created by IntelliJ IDEA.
  User: 张艳敏
  Date: 2017/8/18
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="<%=request.getContextPath()%>/user/insertUser.jhtml" method="post">
  <input type="hidden" name="userId" value="${userId}">
  名称<input type="" name="userAccount" vale="${userAccount}">
  <input type="submit" value="ok">
</form>
</body>
</html>
