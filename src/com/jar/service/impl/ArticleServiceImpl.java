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
     * 分页查询
     * @param page 当前第几页
     * @param pageSize 每页大小
     * @return 封闭了分页信息(包括记录集list)的Bean
     */
    public PageBean queryForPage(int pageSize, int page,String hql) {

        int allRow = articleDao.getAllRowCount(hql); // 总记录数
        int totalPage = PageBean.countTatalPage(pageSize, allRow); // 总页数
        final int offset = PageBean.countOffset(pageSize, page); // 当前页开始记录
        final int length = pageSize; // 每页记录数
        final int currentPage = PageBean.countCurrentPage(page); // 当前页
        List list = articleDao.queryForPage(hql, offset, length); //
        // 把分页信息保存到Bean当中
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
