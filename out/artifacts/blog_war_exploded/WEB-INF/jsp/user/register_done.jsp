<%--
  Created by IntelliJ IDEA.
  User: zhuzw_000
  Date: 2015/8/23
  Time: 23:58
  To change this template use File | Settings | File Templates.
--%>





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


    <script language="javascript" type="text/javascript">


        setTimeout("javascript:location.href='../'", 3000);
    </script>

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

                <li  class="current-menu-item"><a href="./">留言</a></li>
                <li><a href="../contact">联系我</a></li>

            </ul>
            <div id="combo-holder"></div>
        </nav>

    </div>
</header>


<!-- MAIN -->
<div id="main">
    <div class="wrapper clearfix">


        <h2 class="page-heading"><span style="font-family: 微软雅黑">注册成功</span></h2>


        <div id="done" style="font-family: 微软雅黑;align-content: center" >
            注册成功，3秒后跳转

        </div>
    </div>
</div>
<!-- ENDS MAIN -->



</body>

</html>








