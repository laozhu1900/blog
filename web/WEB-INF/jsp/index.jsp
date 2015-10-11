<%--
  Created by IntelliJ IDEA.
  User: zhuzw_000
  Date: 2015/8/14
  Time: 20:55
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

  <link rel="stylesheet" type="text/css" media="all" href="<%=request.getContextPath()%>/resources/css/loginStyle.css">
  <script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-1.6.4.min.js"></script>
  <script type="text/javascript" charset="utf-8" src="<%=request.getContextPath()%>/resources/js/jquery.leanModal.min.js"></script>
  <!-- jQuery plugin leanModal under MIT License http://leanmodal.finelysliced.com.au/ -->



  <%--<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/normalize.css" />--%>
  <%--<link rel='stylesheet prefetch' href='http://libs.useso.com/js/font-awesome/4.2.0/css/font-awesome.min.css'>--%>
  <%--<link rel='stylesheet prefetch' href='<%=request.getContextPath()%>/resources/css/animate.min.css'>--%>
  <%--<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/default.css">--%>
  <%--<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/styles.css">--%>



  <style type="text/css">
    #generalcontext{
      overflow:hidden;
      width:783px;
      white-space:nowrap;
      text-overflow:ellipsis;

    }

  </style>


</head>

<body lang="en">

<header class="clearfix">


  <jsp:include page="basic/top.jsp"/>

  <div class="wrapper clearfix">

    <div id="logo"><img  src="<%=request.getContextPath()%>/resources/img/logo.png" alt="Zeni"></div>

    <nav>
      <ul id="nav" class="sf-menu">
        <li class="current-menu-item"><a href="/">主页</a></li>
        <li><a href="articles/?page=1">博文</a></li>

        <li><a href="message/">留言</a></li>
        <li><a href="contact/">联系我</a></li>
      </ul>
      <div id="combo-holder"></div>
    </nav>
  </div>
</header>

<!-- MAIN -->
<div id="main">
  <div class="wrapper">

    <!-- slider holder -->
    <div id="slider-holder" class="clearfix">

      <!-- slider -->
      <div class="flexslider home-slider">
        <ul class="slides">
          <li>
            <img src="<%=request.getContextPath()%>/resources/img/slides/01.jpg" alt="alt text" />
          </li>
          <li>
            <img src="<%=request.getContextPath()%>/resources/img/slides/02.jpg" alt="alt text" />
            <p class="flex-caption">程序员和上帝打赌要开发出更大更好——傻瓜都会用的软件。而上帝却总能创造出更大更傻的傻瓜。所以，上帝总能赢</p>
          </li>
          <li>
            <img src="<%=request.getContextPath()%>/resources/img/slides/03.jpg" alt="alt text" />
          </li>
        </ul>
      </div>
      <!-- ENDS slider -->

      <div class="home-slider-clearfix "></div>

      <!-- Headline -->
      <div id="headline">
        <h1 style="font-family: 微软雅黑">小朱的博客</h1>
        <p style="font-family: 微软雅黑;">  技术交流分享的平台，激发编程的兴趣，享受生活，用代码编织世界</p>
        <p><a href="https://twitter.com/#!/ansimuz" style="font-family: 微软雅黑"> We are coding !</a></p>
        <em id="corner"></em>
      </div>
      <!-- ENDS headline -->

    </div>
    <!-- ENDS slider holder -->

    <!-- home-block -->
    <div class="home-block" >
      <h2 class="home-block-heading"><span>最新博文</span></h2>

      <!-- 按时间显示博文-->
      <div id="posts-list">
        <c:forEach items="${newest}" var="a" end="4">
          <article class="format-standard">
            <%--<div class="entry-date"><div class="number">--%>
              <%--<fmt:formatNumber type="number" value="${a.editTime/1000000%100}" maxFractionDigits="0" />--%>
            <%--</div> <div class="year">--%>

              <%--<fmt:formatNumber type="number" value="${a.editTime/10000000000}" maxFractionDigits="0" groupingUsed="4"/>--%>
              <%--&nbsp;--%>
              <%--<fmt:formatNumber type="number" value="${a.editTime/100000000%100 }" maxFractionDigits="0" />--%>



            <%--</div></div>--%>

            <h2  class="post-heading"><a href="articles/${a.id}" style="font-family: 微软雅黑 Microsoft Yahei  ;font-size: 13px;">标题：${a.title}</a></h2>


            <div class="excerpt" id="generalcontext" style="font-family: 微软雅黑 Microsoft Yahei ;font-size: 15px;" >
              ${a.context}
            </div>
            ...


            <a href="articles/${a.id}" class="read-more" style="font-family: 微软雅黑 Microsoft Yahei  ;font-size: 12px;">继续阅读 &#8594;</a>
            <div class="meta">
              <div class="categories">In <a href="#">${a.category}</a></div>
              <div class="comments"><a href="#">${a.commentCounts} </a></div>
              <div class="user"><a href="#">${a.author}</a></div>
              <div ><a href="#">

                 <span>
                  <fmt:formatNumber type="number" value="${a.editTime/10000000000}" maxFractionDigits="0" groupingUsed="4"/>
                  -
                  <fmt:formatNumber type="number" value="${a.editTime/100000000%100}" maxFractionDigits="0" minIntegerDigits="2"/>
                  -
                  <fmt:formatNumber type="number" value="${a.editTime/1000000%100}" maxFractionDigits="0" minIntegerDigits="2"/>
                 </span>
              </a></div>
            </div>
          </article>

          <br/>

       </c:forEach>


      </div>

    </div>

    </div>


  </div>
</div>

<jsp:include page="basic/share.jsp"/>

<%--<div class="htmleaf-container">--%>

  <%--<div id='ss_menu'>--%>
    <%--<div>--%>
      <%--<i class="fa fa-qq"></i>--%>
    <%--</div>--%>
    <%--<div>--%>
      <%--<i class="fa fa-weibo"></i>--%>
    <%--</div>--%>
    <%--<div>--%>
      <%--<i class="fa fa-weixin"></i>--%>
    <%--</div>--%>
    <%--<div>--%>
      <%--<i class="fa fa-renren"></i>--%>
    <%--</div>--%>
    <%--<div class='menu'>--%>
      <%--<div class='share' id='ss_toggle' data-rot='180'>--%>
        <%--<div class='circle'></div>--%>
        <%--<div class='bar'></div>--%>
      <%--</div>--%>
    <%--</div>--%>
  <%--</div>--%>

<%--</div>--%>

<%--<script src="http://libs.useso.com/js/jquery/2.1.1/jquery.min.js" type="text/javascript"></script>--%>
<%--<script>window.jQuery || document.write('<script src="js/jquery-2.1.1.min.js"><\/script>')</script><script>--%>
  <%--$(document).ready(function (ev) {--%>
    <%--var toggle = $('#ss_toggle');--%>
    <%--var menu = $('#ss_menu');--%>
    <%--var rot;--%>
    <%--$('#ss_toggle').on('click', function (ev) {--%>
      <%--rot = parseInt($(this).data('rot')) - 180;--%>
      <%--menu.css('transform', 'rotate(' + rot + 'deg)');--%>
      <%--menu.css('webkitTransform', 'rotate(' + rot + 'deg)');--%>
      <%--if (rot / 180 % 2 == 0) {--%>
        <%--toggle.parent().addClass('ss_active');--%>
        <%--toggle.addClass('close');--%>
      <%--} else {--%>
        <%--toggle.parent().removeClass('ss_active');--%>
        <%--toggle.removeClass('close');--%>
      <%--}--%>
      <%--$(this).data('rot', rot);--%>
    <%--});--%>
    <%--menu.on('transitionend webkitTransitionEnd oTransitionEnd', function () {--%>
      <%--if (rot / 180 % 2 == 0) {--%>
        <%--$('#ss_menu div i').addClass('ss_animate');--%>
      <%--} else {--%>
        <%--$('#ss_menu div i').removeClass('ss_animate');--%>
      <%--}--%>
    <%--});--%>
  <%--});--%>
<%--</script>--%>

<jsp:include page="basic/footer.jsp"/>

</body>

</html>