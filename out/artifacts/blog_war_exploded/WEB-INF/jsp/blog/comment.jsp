<%--
  Created by IntelliJ IDEA.
  User: zhuzw_000
  Date: 2015/8/25
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title></title>
</head>
<body>

<div id="comments-wrap">
  <h3 class="heading">${article.commentCounts} 条评论</h3>



    <c:forEach items="${list}" var="comment">
    <ol class="commentlist">

      <li class="comment even thread-even depth-1" id="li-comment-1">

        <div id="comment-1" class="comment-body clearfix">
          <img alt='' src='<%=request.getContextPath()%>/resources/img/my.jpg' class='avatar avatar-35 photo' height='35' width='35' />
          <div class="comment-author vcard">${comment.user.id}</div>
          <div class="comment-meta commentmetadata">
            <span class="comment-date">

               <fmt:formatNumber type="number" value="${comment.editTime/10000000000}" maxFractionDigits="0" groupingUsed="4" minIntegerDigits="4"/>年
               <fmt:formatNumber type="number" value="${comment.editTime/100000000%100}" maxFractionDigits="0" minIntegerDigits="2"/>月
               <fmt:formatNumber type="number" value="${comment.editTime/1000000%100}" maxFractionDigits="0" minIntegerDigits="2"/>日 &nbsp;
               <fmt:formatNumber type="number" value="${comment.editTime/10000%100}" maxFractionDigits="0"  minIntegerDigits="2"/>:
               <fmt:formatNumber type="number" value="${comment.editTime/100%100}" maxFractionDigits="0"  minIntegerDigits="2"/>


            </span>
            <span class="comment-reply-link-wrap"><a class='comment-reply-link' href='replytocom=23#respond' onclick='return addComment.moveForm("comment-1", "1", "respond", "432")'
                                                     style="font-family: 微软雅黑">回复</a></span>

          </div>
          <div class="comment-inner">
            <p>${comment.context}</p>
          </div>
        </div>

        <!-- child -->



        <ul class='children'>
          <li class="comment even alt depth-2" id="li-comment-2-1">
            <div id="comment-2" class="comment-body clearfix">
              <img alt='' src='http://0.gravatar.com/avatar/4f64c9f81bb0d4ee969aaf7b4a5a6f40?s=35&amp;d=&amp;r=G' class='avatar avatar-35 photo' height='35' width='35' />
              <div class="comment-author vcard">Jhon</div>
              <div class="comment-meta commentmetadata">
                <span class="comment-date">1 hour ago  </span>
                <span class="comment-reply-link-wrap"><a class='comment-reply-link' href='replytocom=24#respond' onclick='return addComment.moveForm("comment-2", "2", "respond", "432")'>Reply</a></span>
              </div>
              <div class="comment-inner">
                <p>Pellentesque ornare sem lacinia quam venenatis vestibulum. Vestibulum id ligula porta felis euismod semper. Sed posuere consectetur est at lobortis.</p>
              </div>
            </div>
          </li>


        </ul>
        <!-- ENDS child -->
      </li>

    </ol>
    </c:forEach>

  <c:if test="${not empty user}">
    <!-- Respond -->
    <div id="respond">

      <div class="cancel-comment-reply"><a rel="nofollow" id="cancel-comment-reply-link" href="#respond" style="display:none;">Cancel reply</a></div>
      <form method="post" id="commentform">

        <h3 class="heading">评论</h3>

        <textarea name="comment_context" id="comment"  tabindex="4"></textarea>

        <p><input name="submit" type="submit" id="submit" tabindex="5" value="Post" /></p>

        <input type="hidden" name="articleId" value="${article.id}">
        <input type="hidden" name="userId" value="${user.id}">


        <input type='hidden' name='comment_post_ID' value='' id='comment_post_ID' />
        <input type='hidden' name='comment_parent' id='comment_parent' value='0' />
      </form>
    </div>
    <div class="clearfix"></div>
    <!-- ENDS Respond -->
  </c:if>
</div>
<!-- ENDS comments list -->

</body>
</html>
