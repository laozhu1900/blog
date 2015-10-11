package junit.test;

import com.jar.domain.Article;
import com.jar.domain.Comment;
import com.jar.domain.User;
import com.jar.service.CommentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhuzw_000 on 2015/8/21.
 */
public class testComment {

    @Test
    public void testAdd() throws InterruptedException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        CommentService commentService = (CommentService) ctx.getBean("commentService");


        for(int i=1;i<=10;i++){
            User user = new User();
            user.setId(1);
            Article article = new Article();
            article.setId(1);

            Comment comment = new Comment();

            comment.setEditTime(Long.valueOf(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())));
            comment.setContext("ha"+i);

            comment.setUser(user);
            comment.setArticle(article);

            commentService.add(comment);

            Thread.sleep(1000);

        }

    }


    @Test
    public void testShow(){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        CommentService commentService = (CommentService) ctx.getBean("commentService");

        List<Comment> list = new ArrayList<Comment>();

        list = commentService.show(1);

        for(Comment c:list){

            System.out.println(c.getContext());
        }
    }

}
