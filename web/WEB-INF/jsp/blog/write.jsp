<%--
  Created by IntelliJ IDEA.
  User: zhuzw_000
  Date: 2015/9/2
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>


  <!--写博客-->
  <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/kube.min.css" />
  <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/screen.css" />
  <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/redactor.css" />

  <!--[if lt IE 9]>
  <script src="<%=request.getContextPath()%>/resources/js/html5.js"></script>
  <![endif]-->

  <script src="<%=request.getContextPath()%>/resources/js/jquery-1.6.4.min.js"></script>
  <script src="<%=request.getContextPath()%>/resources/js/global.js"></script>
  <script src="<%=request.getContextPath()%>/resources/js/redactor.js"></script>
  <script src="<%=request.getContextPath()%>/resources/js/prettify.js"></script>
  <script src="<%=request.getContextPath()%>/resources/js/zh_cn.js"></script>
  <script type="text/javascript">
    $(function () {
      $('#redactor_content').redactor({
        fixed: true,
        lang: "zh_cn",
        wym: true,
        //air: true
      });
    });
  </script>

  <style type="text/css">
    .clearfix2{
      height: 150px;
      clear: both;
      color: #888;
      display: block;
      margin: 0;
      padding: 0;
      border: 0;
      font-size: 100%;
      font: inherit;
      vertical-align: baseline;
      outline: none;
      -webkit-font-smoothing: antialiased;
      -webkit-text-size-adjust: 100%;
      -ms-text-size-adjust: 100%;
      -webkit-box-sizing: border-box;
      -moz-box-sizing: border-box;
      box-sizing: border-box;
      background: #444 url(/resources/img/header.png) bottom left repeat-x;
    }

    .clearfix2:after {
      content: ".";
      display: block;
      clear: both;
      visibility: hidden;
      line-height: 0;
      height: 0;
    }
    .wrapper2{
      width: 940px;
      -webkit-text-size-adjust: 100%;
      margin: 0 auto;
      position: relative;
      margin: 0;
      padding: 0;
      border: 0;
      font-size: 100%;
      font: inherit;
      vertical-align: baseline;
      outline: none;
      -webkit-font-smoothing: antialiased;
      -webkit-text-size-adjust: 100%;
      -ms-text-size-adjust: 100%;
      -webkit-box-sizing: border-box;
      -moz-box-sizing: border-box;
      box-sizing: border-box;
      display: block;
      color: #313131;
    }


    #logo2{
      display: inline-block;
      padding-top: 40px;
      padding-bottom: 30px;
      margin-left: 485px;
    }

    .sf-menu2, .sf-menu2 * {

      padding: 0;
      list-style: none;
    }

    li  {
      list-style: none;

      margin-left: 10px;

      float: left;
      border: 0;
      font-size: 16px;

      color: #f3faef;

      display: block;


    }
    ::selection {
      background: #ea4c88;
      color: #fff;
    }
    #nav2{

      display: block;
      margin-left: 500px;
      margin-top: 10px;
      padding: 0;
      border: 0;
      font-size: 100%;
      font: inherit;


      height: 30px;

    }


    .btn-1 {
      border: 3px solid #FFF;
      color: #FFF;
    }
    .btn {
      border: medium none;
      font-family: inherit;
      font-size: inherit;
      color: inherit;
      background: transparent none repeat scroll 0% 0%;
      cursor: pointer;
      padding: 20px 60px;
      display: inline-block;
      margin: 15px 30px;
      text-transform: uppercase;
      letter-spacing: 1px;
      font-weight: 700;
      outline: medium none;
      position: relative;
      transition: all 0.3s ease 0s;
    }



  </style>


</head>
<body>

<header class="clearfix2">



  <div class="wrapper2">

       <img src="/blog/resources/img/logo.png" id="logo2" alt="Zeni">

    <nav>
      <ul id="nav2"  class="sf-menu2 sf-js-enabled2 sf-shadow2">
        <li><a href="../" style="color: #bebec5;text-decoration: none">主页</a></li>
        <li  class="current-menu-item2"><a href="./?page=1" style="color: #bebec5;text-decoration: none">博文</a></li>

        <li><a href="../message"style="color: #bebec5;text-decoration: none">留言</a></li>
        <li><a href="../contact" style="color: #bebec5;text-decoration: none">联系我</a></li>
      </ul>
      <div id="combo-holder2"></div>
    </nav>

  </div>


</header>


  <form method="post">

    <div id="box-inside-white">
      <div class="wrapper">
        <div id="main" class="row" style="height:1000px">

          <article class="threequarter">
            <div style="font-family: 黑体">
              <%--标题： <input id="article_title" name="article_title"/>--%>
               标题： <input name="article_title" id="name" type="text" class="form-poshytip" title="请输入您的用户名" style="font-family: 微软雅黑;width: 300px" />
            </div>
              <br/>
            <textarea id="redactor_content" name="article_context" style="height: 580px;">
              <p>这是内容</p>
            </textarea>
            <br/>

            <div style="float: right">
              <label><input name="category" type="radio" value="digit" />数码 </label>
              <label><input name="category" type="radio" value="code" />编程 </label>
              <label><input name="category" type="radio" value="bigData" />大数据 </label>
              <label><input name="category" type="radio" value="life" />生活 </label>

            </div>

            <div id="write_done">
              <button type="submit" class="btn btn-1 btn-1a" style="font-size: 16px;font-family: 微软雅黑">提交</button>
            </div>
          </article>

        </div>
      </div>
    </div>


  </form>
</body>
</html>
