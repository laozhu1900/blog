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
      * ��ҳ��ѯ
      * @param hql ��ѯ������
      * @param offset ��ʼ��¼
      * @param length һ�β�ѯ������¼
      * @return
      * */
     List queryForPage(final String hql,final int offset,final int length);

     /**
      * ��ѯ���м�¼��
      * @param hql ��ѯ������
      * @return �ܼ�¼��
      */
     int getAllRowCount(String hql);


}
