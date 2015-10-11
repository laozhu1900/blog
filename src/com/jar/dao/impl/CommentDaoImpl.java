package com.jar.dao.impl;

import com.jar.dao.CommentDao;
import com.jar.domain.Comment;
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
public class CommentDaoImpl extends HibernateDaoSupport implements CommentDao,HibernateCallback {


    public void add(Comment comment) {
        this.getHibernateTemplate().save(comment);
    }

    public List<Comment> show(final int articleId) {
        return this.getHibernateTemplate().execute(new HibernateCallback<List<Comment>>() {
            public List<Comment> doInHibernate(Session session) throws HibernateException, SQLException {

                String hql = "from Comment c where c.article.id = ? order by c.editTime desc ";

                Query query = session.createQuery(hql);

                query.setInteger(0,articleId);

                return query.list();
            }
        });
    }

    public Object doInHibernate(Session session) throws HibernateException {
        return null;
    }
}
