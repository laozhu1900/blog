<%--
  Created by IntelliJ IDEA.
  User: zhuzw_000
  Date: 2015/8/25
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en-US">
<head>
  <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
  <title>Modal Login Window Demo</title>


  <link rel="stylesheet" type="text/css" media="all" href="<%=request.getContextPath()%>/resources/css/loginStyle.css">
  <script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-1.6.4.min.js"></script>
  <script type="text/javascript" charset="utf-8" src="<%=request.getContextPath()%>/resources/js/jquery.leanModal.min.js"></script>
  <!-- jQuery plugin leanModal under MIT License http://leanmodal.finelysliced.com.au/ -->


  <style type="text/css"  >
    .head_login{
      float: right;
      margin-right:200px ;
    }
  </style>

</head>


<body>
<div class="head_login">
  <c:if test="${empty user}">
    <div class="login" style="font-family: 微软雅黑">

      <a href="#loginmodal" class="flatbtn" id="modaltrigger">登陆</a>
      <a href="<%=request.getContextPath()%>/user/register" class="flatbtn" >注册</a>

      <div id="loginmodal" style="display:none;">
        <h1>用户登录：</h1>
        <form id="loginform"  method="post" action="<%=request.getContextPath()%>/user/login">
          <label for="username">用户名:</label>
          <input type="text" name="username" id="username" class="txtfield" tabindex="1">

          <label for="password">密码:</label> <span>${ex.message}</span>
          <input type="password" name="password" id="password" class="txtfield" tabindex="2">

          <div class="center">
            <input type="submit"  id="loginbtn" class="flatbtn-blu hidemodal" value="登陆" >
          </div>
        </form>
      </div>
      <script type="text/javascript">
        $(function(){
          $('#loginform').submit(function(e){
            return true;
          });

          $('#modaltrigger').leanModal({ top: 110, overlay: 0.45, closeButton: ".hidemodal" });
        });
      </script>

    </div>
  </c:if>



  <c:if test="${not empty user}">

    <div class="flatbtn">
        ${user.username} &nbsp;
      <a href="<%=request.getContextPath()%>/user/logout" style="color: #eaeaea ;font-family: 黑体" >退出</a>
    </div>

  </c:if>



</div>
<%--<decorator:body/>--%>
</body>
</html>