package junit.test;

import com.jar.dao.impl.ArticleDaoImpl;
import com.jar.domain.Article;
import com.jar.domain.User;
import com.jar.service.ArticleService;
import com.jar.util.PageBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by zhuzw_000 on 2015/8/21.
 */
public class testArticle {

    @Test
    public void testAdd(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ArticleService articleService = (ArticleService) ctx.getBean("articleService");

        for(int i=1;i<10;i++) {

            Article article = new Article();

            article.setAuthor("zzw:"+i);
            article.setContext("hello world:"+i);
            article.setEditTime(Long.valueOf(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())));
            article.setTitle("hello:"+i);

            String arr[]={"code","life","digit","bigData"};

            Random random = new Random();

            int index = random.nextInt(arr.length);
            article.setCategory(arr[index]);

            User user = new User();
            user.setId(1);

            article.setUser(user);

            articleService.add(article);
        }
    }

    @Test
    public void testShow(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ArticleService articleService = (ArticleService) ctx.getBean("articleService");


        List<Article> list = new ArrayList<Article>();
        list = articleService.show();

        Map<Integer,Article> map = new HashMap<Integer,Article>();

        for(Article a:list){
           map.put(a.getId(),a);
        }

        for(Map.Entry<Integer,Article> entry:map.entrySet()){
            System.out.println("key=" + entry.getKey() + ",value=" + entry.getValue());
        }

    }

    @Test
    public void testListKind(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ArticleService articleService = (ArticleService) ctx.getBean("articleService");


        List<Article> list = new ArrayList<Article>();

        list = articleService.listOneCty("code");

        for(Article a:list){
            System.out.println(a.getAuthor());
        }

    }

    @Test
    public void testShowOne(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ArticleService articleService = (ArticleService) ctx.getBean("articleService");

        Article article = new Article();

        article = (Article) articleService.showOne(12);

        System.out.print("Context£º"+article.getContext());
    }

    @Test
    public void testUpdate(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ArticleService articleService = (ArticleService) ctx.getBean("articleService");

       articleService.update("2222","22222",22222,12);
    }

    @Test
    public void testDelete(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ArticleService articleService = (ArticleService) ctx.getBean("articleService");



        articleService.delete(12);

    }


    @Test
    public void testShowByPage(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ArticleService articleService = (ArticleService) ctx.getBean("articleService");

        int page=1;
        PageBean pageBean = new PageBean();
        String hql = "from Article a order by a.editTime desc";
        pageBean = articleService.queryForPage(5,page,hql);
        List<Article> list = new ArrayList<Article>();

        list = pageBean.getList();

        for(Article a:list){
            System.out.println(a.getEditTime());
        }
    }

    @Test
    public void testGetTotalRecord(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ArticleService articleService = (ArticleService) ctx.getBean("articleService");


    }


}
