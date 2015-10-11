package com.jar.service;

import com.jar.domain.Article;
import com.jar.util.PageBean;

import java.util.List;
import java.util.Map;
/**
 * Created by zhuzw_000 on 2015/8/21.
 */
public interface ArticleService {

     void add(Article article);

     List<Article> show();

     List<Article> listOneCty(String category);

     Article showOne(int id);

    void update(String title,String context,long editTime,int id);

    void addCommentCounts(int id);

    void delete(int id);


    /** *//**
     * 分页查询
     * @param currentPage 当前第几页
     * @param pageSize 每页大小
     * @return 封闭了分页信息(包括记录集list)的Bean
     */
    PageBean queryForPage(int pageSize,int currentPage,String hql);


}
