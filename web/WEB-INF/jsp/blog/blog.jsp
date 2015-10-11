<%--
  Created by IntelliJ IDEA.
  User: zhuzw_000
  Date: 2015/8/15
  Time: 16:11
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


  <style type="text/css">
    li{
      list-style-type: none;

    }

    #blog_category{
      font-size: 20px;
      font-family: 黑体;

    }

    #blog_info{

      font-family: 黑体;
      font-size: 15px;

    }

    #blog_edit_date{
      float: right;
      margin-right: auto;
      margin-left: 20px;
      font-size: 14px;

    }

    #blog_name{
      float: left;
      font-size: 14px;
      width:520px;
    }

    #category_list{
      float: right;

    }

    #posts-list{
      float: left;
      width: auto;
    }


    .single_blog{
      height: 25px;
    }

    .cat-item{
      height: 20px;
      font-size:14px;
    }
  </style>


</head>

<body lang="en">

<header class="clearfix">

  <jsp:include page="../basic/top.jsp"/>

  <div class="wrapper ">
    <div id="logo"><img  src="<%=request.getContextPath()%>/resources/img/logo.png" alt="Zeni"></div>

    <nav>
      <ul id="nav" class="sf-menu">
        <li><a href="../">主页</a></li>
        <li class="current-menu-item"><a href="./?page=1">博文</a></li>
        <li><a href="../message/">留言</a></li>
        <li><a href="../contact/">联系我</a></li>
      </ul>
    </nav>
    <div id="combo-holder"></div>
  </div>
</header>


<!-- MAIN -->
<div id="main">
  <div class="wrapper clearfix">



    <!-- posts list -->
    <div id="posts-list">

      <h2 class="page-heading"><span>文章目录</span></h2>

      <div>

        <c:forEach items="${list}" var="article">
          <li class="single_blog">
            <div id="blog_name" style="font-family: 微软雅黑">
              <a href="${article.id}">${article.title}</a>
            </div>
            <div id="blog_edit_date">
              <c:if test="${not empty user.authority}">
                 <span style="font-family: '黑体'">(<a href="${article.id}/edit">编辑</a>/<a href="${article.id}/delete">删除</a>)</span>&nbsp;&nbsp;
              </c:if>
              <span>
                <fmt:formatNumber type="number" value="${article.editTime/10000000000}" maxFractionDigits="0" groupingUsed="4"/>
                -
                <fmt:formatNumber type="number" value="${article.editTime/100000000%100}" maxFractionDigits="0" minIntegerDigits="2"/>
                -
                <fmt:formatNumber type="number" value="${article.editTime/1000000%100}" maxFractionDigits="0" minIntegerDigits="2"/>
              </span>
            </div>
            <div id="blog_br"><br/></div>
          </li>
        </c:forEach>
      </div>

    </div>
    <!-- ENDS posts list -->

    <!-- sidebar -->
    <div id="category_list">
      <aside id="sidebar">

        <ul>
          <li class="block">
            <h4><div id="blog_category" >分类</div></h4>
            <ul id="blog_info">
              <li class="cat-item"><a href="digit?page=1" title="View all posts" >数码</a></li>
              <li class="cat-item"><a href="code?page=1" title="View all posts">编程</a></li>
              <li class="cat-item"><a href="bigData?page=1" title="View all posts">大数据</a></li>
              <li class="cat-item"><a href="life?page=1" title="View all posts">生活</a></li>
              <br/>
              <c:if test="${not empty user.authority}">
                <li class="cat-item"><a href="write" title="View all posts">写博客</a></li>
              </c:if>
            </ul>
          </li>

        </ul>

        <em id="corner"></em>
      </aside>
    </div>
    <!-- ENDS sidebar -->

  </div>
</div>
<!-- ENDS MAIN -->
<div align="center">
  <c:if test="${page gt 1}">
   <a href="./?page=${page-1}"><button name="page" value="${page-1}">上一页</button></a>
  </c:if>

  &nbsp;
  <c:if test="${page eq 1}">
    <button name="page" value="${page-1}">上一页</button>
  </c:if>
  &nbsp;
  <c:if test="${page lt totalPage}">
    <a href="./?page=${page+1}"><button name="page" value="${page+1}">下一页</button></a>
  </c:if>
  &nbsp;
  <c:if test="${page eq totalPage}">
    <button name="page" value="${page+1}">下一页</button>
  </c:if>

  &nbsp;
</div>


</body>

</html>