<%--
  Created by IntelliJ IDEA.
  User: zhuzw_000
  Date: 2015/8/24
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
  <%
    session.invalidate();
    response.sendRedirect("../");
  %>
</body>
</html>
