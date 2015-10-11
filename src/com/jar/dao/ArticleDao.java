package com.jar.dao;

import com.jar.domain.Article;

import java.util.List;

/**
 * Created by zhuzw_000 on 2015/8/21.
 */
public interface ArticleDao {

     void add(Article article);

     List<Article> show();

     List<Article> listOneCty(String category);

     Article showOne(int id);

     void update(String title,String context,long editTime,int id);

     void addCommentCount(int id);

     void delete(int id);


     /**
      * 分页查询
      * @param hql 查询的条件
      * @param offset 开始记录
      * @param length 一次查询几条记录
      * @return
      * */
     List queryForPage(final String hql,final int offset,final int length);

     /**
      * 查询所有记录数
      * @param hql 查询的条件
      * @return 总记录数
      */
     int getAllRowCount(String hql);


}
