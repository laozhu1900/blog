package com.jar.service.impl;

import com.jar.dao.ArticleDao;
import com.jar.domain.Article;
import com.jar.service.ArticleService;
import com.jar.util.PageBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhuzw_000 on 2015/8/21.
 */
public class ArticleServiceImpl implements ArticleService {

    private ArticleDao articleDao;

    public void setArticleDao(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    public void add(Article article) {
        articleDao.add(article);
    }

    public List<Article> show() {
        return articleDao.show();
    }

    public Article showOne(int id) {
        return (Article) articleDao.showOne(id);
    }

    public void update(String title, String context, long editTime, int id) {

        articleDao.update(title,context,editTime,id);
    }

    public List<Article> listOneCty(String category) {
        return articleDao.listOneCty(category);
    }

    public void addCommentCounts(int id) {
        articleDao.addCommentCount(id);
    }

    public void delete(int id) {
        articleDao.delete(id);
    }


    /**
     * ��ҳ��ѯ
     * @param page ��ǰ�ڼ�ҳ
     * @param pageSize ÿҳ��С
     * @return ����˷�ҳ��Ϣ(������¼��list)��Bean
     */
    public PageBean queryForPage(int pageSize, int page,String hql) {

        int allRow = articleDao.getAllRowCount(hql); // �ܼ�¼��
        int totalPage = PageBean.countTatalPage(pageSize, allRow); // ��ҳ��
        final int offset = PageBean.countOffset(pageSize, page); // ��ǰҳ��ʼ��¼
        final int length = pageSize; // ÿҳ��¼��
        final int currentPage = PageBean.countCurrentPage(page); // ��ǰҳ
        List list = articleDao.queryForPage(hql, offset, length); //
        // �ѷ�ҳ��Ϣ���浽Bean����
        PageBean pageBean = new PageBean();
        pageBean.setPageSize(pageSize);
        pageBean.setCurrentPage(currentPage);
        pageBean.setAllRow(allRow);
        pageBean.setTotalPage(totalPage);
        pageBean.setList(list);
        pageBean.init();

        return pageBean;
    }


}
