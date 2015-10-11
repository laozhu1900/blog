package com.jar.dao.impl;

import com.jar.dao.MessageDao;
import com.jar.domain.Message;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by zhuzw_000 on 2015/9/6.
 */
public class MessageDaoImpl extends HibernateDaoSupport implements MessageDao,HibernateCallback {

    public void add(Message message) {
        this.getHibernateTemplate().save(message);
    }

    public List<Message> show() {
        return this.getHibernateTemplate().execute(new HibernateCallback<List<Message>>() {
            public List<Message> doInHibernate(Session session) throws HibernateException, SQLException {

                String hql = "from Message m order by m.editTime desc ";

                Query query = session.createQuery(hql);

                return query.list();

            }
        });
    }

    public Object doInHibernate(Session session) throws HibernateException {
        return null;
    }
}
