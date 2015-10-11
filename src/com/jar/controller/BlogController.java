package com.jar.controller;

import com.jar.domain.Article;
import com.jar.domain.Comment;
import com.jar.domain.User;
import com.jar.service.ArticleService;
import com.jar.service.CommentService;
import com.jar.util.PageBean;
import com.jar.util.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhuzw_000 on 2015/8/21.
 */

@Controller
@RequestMapping("/articles")
public class BlogController {


    @Autowired
    private ArticleService articleService;

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/" ,method = RequestMethod.GET)
    public String blog(Model model,int page){

        System.out.print("currentpage is"+page);

        List<Article> list = new ArrayList<Article>();
//        list = articleService.show();

        String hql = "from Article a order by a.editTime desc";

        PageBean pageBean = new PageBean();

        model.addAttribute("page",page);

        pageBean = articleService.queryForPage(12,page,hql);

        list = pageBean.getList();

        model.addAttribute("totalPage",pageBean.getTotalPage());

        model.addAttribute("list",list);

        return "blog/blog";
    }

    @RequestMapping(value = "/write" ,method = RequestMethod.POST)
    public String write( String article_title, String article_context,String category){

        User user = new User();
        user.setId(1);

        Article article = new Article();

        article.setUser(user);

        article.setTitle(article_title);
        article.setContext(article_context);
        article.setCategory(category);
        article.setEditTime(Long.valueOf(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())));

        article.setAuthor("zzw");

        articleService.add(article);

        return "redirect:./?page=1";
    }

    @RequestMapping(value = "/write",method = RequestMethod.GET)
    public String write(){

        return "blog/write";
    }




    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String single(@PathVariable int id,Model model){

        Article article = new Article();
        article = (Article) articleService.showOne(id);

        List<Comment> list = new ArrayList<Comment>();

        list = commentService.show(id);

        model.addAttribute(article);

        model.addAttribute("list",list);

        return "blog/single";
    }


    @RequestMapping(value = "/{id}/edit" )
    public String edit(@PathVariable int id,Model model){

        Article article = new Article();
        article = (Article) articleService.showOne(id);

        model.addAttribute(article);
        return "blog/edit";
    }


    @RequestMapping(value = "/articles" ,method = RequestMethod.POST)
    public String edit(String article_title, String article_context,int id ){

        articleService.update(article_title,article_context,
                Long.valueOf(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())),id);

        return "redirect:/blog/?page=1";

    }

    @RequestMapping(value = "/digit",method = RequestMethod.GET)
    public String listDigit(Model model,int page){

        List<Article> list = new ArrayList<Article>();

        String hql = "from Article a where a.category='digit' order by a.editTime desc  ";

        PageBean pageBean = new PageBean();

        model.addAttribute("page",page);

        pageBean = articleService.queryForPage(12,page,hql);

        list = pageBean.getList();

        model.addAttribute("totalPage",pageBean.getTotalPage());

        model.addAttribute("list",list);

        return "blog/blog";

    }

    @RequestMapping(value = "/code",method = RequestMethod.GET)
    public String listCode(Model model,int page){
        List<Article> list = new ArrayList<Article>();

        String hql = "from Article a where a.category='code' order by a.editTime desc  ";

        PageBean pageBean = new PageBean();

        model.addAttribute("page",page);

        pageBean = articleService.queryForPage(12,page,hql);

        list = pageBean.getList();

        model.addAttribute("totalPage",pageBean.getTotalPage());

        model.addAttribute("list",list);

        return "blog/blog";
    }

    @RequestMapping(value = "/bigData",method = RequestMethod.GET)
    public String listBigData(Model model,int page){

        List<Article> list = new ArrayList<Article>();

        String hql = "from Article a where a.category='bigData' order by a.editTime desc  ";

        PageBean pageBean = new PageBean();

        model.addAttribute("page",page);

        pageBean = articleService.queryForPage(12,page,hql);

        list = pageBean.getList();

        model.addAttribute("totalPage",pageBean.getTotalPage());

        model.addAttribute("list",list);

        return "blog/blog";
    }

    @RequestMapping(value = "/life",method = RequestMethod.GET)
    public String listLife(Model model,int page){

        List<Article> list = new ArrayList<Article>();

        String hql = "from Article a where a.category='life' order by a.editTime desc  ";

        PageBean pageBean = new PageBean();

        model.addAttribute("page",page);

        pageBean = articleService.queryForPage(12,page,hql);

        list = pageBean.getList();

        model.addAttribute("totalPage",pageBean.getTotalPage());

        model.addAttribute("list",list);

        return "blog/blog";
    }


    @RequestMapping(value = "/{articleId}",method = RequestMethod.POST)
    public String addComment(@PathVariable int articleId,int userId,String comment_context){

        Comment comment = new Comment();

        comment.setContext(comment_context);

        User user = new User();
        Article article = new Article();

        user.setId(userId);

        article.setId(articleId);

        comment.setUser(user);
        comment.setArticle(article);

        comment.setEditTime(new Tools().getCurrentTime());

        commentService.add(comment);

        articleService.addCommentCounts(articleId);

        return "redirect:./{articleId}";
    }

    @RequestMapping(value = "/{articleId}/delete")
    public String delete(@PathVariable int articleId){

        articleService.delete(articleId);

        return "redirect:../";
    }

}
