package com.jar.dao.impl;

import com.jar.dao.ArticleDao;
import com.jar.domain.Article;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by zhuzw_000 on 2015/8/21.
 */
public class ArticleDaoImpl extends HibernateDaoSupport implements ArticleDao ,HibernateCallback{

    public void add(Article article) {
        this.getHibernateTemplate().save(article);
    }


    public List<Article> show() {

        return (List<Article>) this.getHibernateTemplate().execute(new HibernateCallback() {
            public List<Article> doInHibernate(Session session) throws HibernateException, SQLException {

                Query query = session.createQuery("from Article a order by a.editTime desc ");

                return query.list();
            }
        });
    }

    public Article showOne(final int id) {
        return (Article) this.getHibernateTemplate().execute(new HibernateCallback<Object>() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {

                Query query = session.createQuery("from Article a where id=?");
                query.setInteger(0,new Integer(id));
                return query.uniqueResult();
            }
        });
    }

    public void update(final String title, final String context, final long editTime, final int id) {

        this.getHibernateTemplate().execute(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {

                Query query = session.createQuery("update Article a set a.title=?,a.context=?,a.editTime=? where id=?");

                query.setString(0,title);
                query.setString(1,context);
                query.setLong(2,editTime);
                query.setInteger(3,new Integer(id));

                return query.executeUpdate();

            }
        });

    }

    public List<Article> listOneCty(final String category) {
        return this.getHibernateTemplate().execute(new HibernateCallback<List<Article>>() {
            public List<Article> doInHibernate(Session session) throws HibernateException, SQLException {
                String hql = "from Article a where a.category=? order by a.editTime desc ";

                Query query = session.createQuery(hql);

                query.setString(0,category);
                return query.list();
            }
        });
    }


    public void addCommentCount(final int id) {
        this.getHibernateTemplate().execute(new HibernateCallback() {

            public Object doInHibernate(Session session) throws HibernateException, SQLException {

                String hql = "update Article a set a.commentCounts = a.commentCounts + 1 where a.id = ?";

                Query query = session.createQuery(hql);

                query.setInteger(0,id);

                return query.executeUpdate();

            }
        });
    }

    public void delete(final int id) {
        this.getHibernateTemplate().execute(new HibernateCallback<Object>() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                String hql = "delete from Article a where a.id=?";

                Query query = session.createQuery(hql);

                query.setInteger(0,id);

                return query.executeUpdate();
            }
        });
    }

    public Object doInHibernate(Session session) throws HibernateException, SQLException {
        return null;
    }




    /**
     * 分页查询
     * @param hql 查询的条件
     * @param offset 开始记录
     * @param length 一次查询几条记录
     * @return
     */
    public List queryForPage(final String hql,final int offset,final int length){
        List list = getHibernateTemplate().executeFind(new HibernateCallback(){
            public Object doInHibernate(Session session) throws HibernateException,SQLException{
                Query query = session.createQuery(hql);
                query.setFirstResult(offset);
                query.setMaxResults(length);
                List list = query.list();
                return list;
                }
            });
        return list;
    }


    /**
     * 查询所有记录数
     * @return 总记录数
     */
    public int getAllRowCount(String hql){
        return getHibernateTemplate().find(hql).size();
    }

}
