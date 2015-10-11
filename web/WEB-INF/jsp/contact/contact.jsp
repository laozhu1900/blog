<%--
  Created by IntelliJ IDEA.
  User: zhuzw_000
  Date: 2015/9/6
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html class="no-js">

<head>
  <meta charset="utf-8"/>
  <title>ZENI</title>

  <!--[if lt IE 9]>
  <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
  <![endif]-->
  <link rel="stylesheet" media="all" href="<%=request.getContextPath()%>/resources/css/style.css"/>
  <meta name="viewport" content="width=device-width, initial-scale=1"/>
  <!-- Adding "maximum-scale=1" fixes the Mobile Safari auto-zoom bug: http://filamentgroup.com/examples/iosScaleBug/ -->


  <!-- JS -->
  <script src="<%=request.getContextPath()%>/resources/js/jquery-1.6.4.min.js"></script>
  <script src="<%=request.getContextPath()%>/resources/js/css3-mediaqueries.js"></script>
  <script src="<%=request.getContextPath()%>/resources/js/custom.js"></script>
  <script src="<%=request.getContextPath()%>/resources/js/tabs.js"></script>

  <!-- Tweet -->
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/jquery.tweet.css" media="all"  />
  <script src="<%=request.getContextPath()%>/resources/js/tweet/jquery.tweet.js" ></script>
  <!-- ENDS Tweet -->

  <!-- superfish -->
  <link rel="stylesheet" media="screen" href="<%=request.getContextPath()%>/resources/css/superfish.css" />
  <script  src="<%=request.getContextPath()%>/resources/js/superfish-1.4.8/js/hoverIntent.js"></script>
  <script  src="<%=request.getContextPath()%>/resources/js/superfish-1.4.8/js/superfish.js"></script>
  <script  src="<%=request.getContextPath()%>/resources/js/superfish-1.4.8/js/supersubs.js"></script>
  <!-- ENDS superfish -->

  <!-- prettyPhoto -->
  <script  src="<%=request.getContextPath()%>/resources/js/prettyPhoto/js/jquery.prettyPhoto.js"></script>
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/js/prettyPhoto/css/prettyPhoto.css"  media="screen" />
  <!-- ENDS prettyPhoto -->

  <!-- poshytip -->
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/js/poshytip-1.1/src/tip-twitter/tip-twitter.css"  />
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/js/poshytip-1.1/src/tip-yellowsimple/tip-yellowsimple.css"  />
  <script  src="<%=request.getContextPath()%>/resources/js/poshytip-1.1/src/jquery.poshytip.min.js"></script>
  <!-- ENDS poshytip -->

  <!-- GOOGLE FONTS -->
  <link href='http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz:400,300' rel='stylesheet' type='text/css'>

  <!-- Flex Slider -->
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/flexslider.css" >
  <script src="<%=request.getContextPath()%>/resources/js/jquery.flexslider-min.js"></script>
  <!-- ENDS Flex Slider -->

  <!-- Less framework -->
  <link rel="stylesheet" media="all" href="<%=request.getContextPath()%>/resources/css/lessframework.css"/>

  <!-- modernizr -->
  <script src="<%=request.getContextPath()%>/resources/js/modernizr.js"></script>

  <!-- SKIN -->
  <link rel="stylesheet" media="all" href="<%=request.getContextPath()%>/resources/css/skin.css"/>

  <!-- reply move form -->
  <script src="<%=request.getContextPath()%>/resources/js/moveform.js"></script>


</head>

<body lang="en">

<header class="clearfix">

  <jsp:include page="../basic/top.jsp"/>

  <div class="wrapper">
    <div id="logo"><img  src="<%=request.getContextPath()%>/resources/img/logo.png" alt="Zeni"></div>

    <nav>
      <ul id="nav" class="sf-menu">
        <li><a href="../">主页</a></li>
        <li><a href="../articles/?page=1">博文</a></li>

        <li><a href="../message/">留言</a></li>
        <li class="current-menu-item"><a href="./">联系我</a></li>

      </ul>
      <div id="combo-holder"></div>
    </nav>

  </div>
</header>


<!-- MAIN -->
<div id="main">
  <div class="wrapper clearfix">


    <h2 class="page-heading"><span style="font-family: 微软雅黑">联系我</span></h2>

    <!-- page content -->
    <div id="page-content" class="clearfix">

      <!-- Map
      <script type="text/javascript" src="https://maps.google.com/maps/api/js?sensor=true" />
      <script type="text/javascript">
              function initialize() {
                var latlng = new google.maps.LatLng(-34.397, 150.644);
                var myOptions = {
                  zoom: 8,
                  center: latlng,
                  mapTypeId: google.maps.MapTypeId.ROADMAP
                };
                var map = new google.maps.Map(document.getElementById("map_canvas"),
                        myOptions);
              }
      </script>

-->
      <div class="map-content" style="font-family: 微软雅黑;font-size: 14px">
        本站用于编程技术交流分享。文章均为博主原创，有技术性问题或者问题或意见可以使用如下方式联系博主。<br/>
        邮箱：zhuzw0929@163.com
      </div>

      <!-- form -->
      <c:if test="${empty contactMsg}">
        <script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/form-validation.js"></script>
        <form id="contactForm" action="call" method="post">
          <h2 class="heading" style="font-family: 微软雅黑">联系方式</h2>
          <p style="font-family: 微软雅黑"> 请在如下的表格中填写您的信息</p>
          <fieldset>
            <div>
              <input name="username"  id="name" type="text" class="form-poshytip" title="请输入您的用户名" style="font-family: 微软雅黑" />
              <label>用户名</label>
            </div>
            <div>
              <input name="email"  id="email" type="text" class="form-poshytip" title="请输入您的邮箱" style="font-family: 微软雅黑" />
              <label>邮箱</label>
            </div>
            <div>

              <input name="web"  id="web" type="text" class="form-poshytip" title="请输入您的主页" style="font-family: 微软雅黑" />
              <label>主页</label>
            </div>
            <div>
              <textarea  name="advice"  id="comments" rows="5" cols="20" class="form-poshytip" title="请输入您的信息" style="font-family: 微软雅黑"></textarea>
            </div>

            <!-- send mail configuration
            <input type="hidden" value="email@yourserver.com" name="to" id="to" />
            <input type="hidden" value="Enter the subject here" name="subject" id="subject" />
            <input type="hidden" value="send-mail.php" name="sendMailUrl" id="sendMailUrl" />
             ENDS send mail configuration -->

            <p><input type="submit" value="提交" name="submit" id="submit" /> <span id="error" class="warning">Message</span></p>
          </fieldset>

        </form>
      </c:if>
      <c:if test="${not empty contactMsg}">
        <p  style="font-family: 微软雅黑">${contactMsg}</p>
      </c:if>
      <!-- ENDS form -->



    </div>
    <!--  page content-->

  </div>
</div>
<!-- ENDS MAIN -->


</body>

</html>