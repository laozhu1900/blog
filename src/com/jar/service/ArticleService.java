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
     * ��ҳ��ѯ
     * @param currentPage ��ǰ�ڼ�ҳ
     * @param pageSize ÿҳ��С
     * @return ����˷�ҳ��Ϣ(������¼��list)��Bean
     */
    PageBean queryForPage(int pageSize,int currentPage,String hql);


}
