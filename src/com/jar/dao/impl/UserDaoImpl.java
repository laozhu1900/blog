package com.jar.dao.impl;

import com.jar.dao.UserDao;
import com.jar.domain.User;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.sql.SQLException;

/**
 * Created by zhuzw_000 on 2015/8/20.
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao ,HibernateCallback{

    public Object doInHibernate(Session session) throws HibernateException {
        return null;
    }

    public void add(User user) {
        this.getHibernateTemplate().save(user);
    }

    public User login(final String username, final String password) {
        return this.getHibernateTemplate().execute(new HibernateCallback<User>() {
            public User doInHibernate(Session session) throws HibernateException, SQLException {
                String hql = "from User u where u.username=? and password=?";

                Query query = session.createQuery(hql);

                query.setString(0,username);
                query.setString(1,password);

                return (User) query.uniqueResult();
            }
        });
    }

//    public User finEmail(final String email) {
//
//        return this.getHibernateTemplate().execute(new HibernateCallback<User>() {
//            public User doInHibernate(Session session) throws HibernateException, SQLException {
//
//                String hql = "from User u where u.username=?";
//                Query query = session.createQuery(hql);
//                query.setString(0,email);
//                return (User) query.uniqueResult();
//            }
//        });
//    }


    public User finEmail(final String email) {
        return this.getHibernateTemplate().execute(new HibernateCallback<User>() {
            public User doInHibernate(Session session) throws HibernateException, SQLException {

                String hql = "from User u where u.email=?";
                Query query = session.createQuery(hql);
                query.setString(0,email);
                return (User) query.uniqueResult();
            }
        });
    }

    public void updateLoginIpAndTime(final String loginIp, final long loginTime, final int id){
        this.getHibernateTemplate().execute(new HibernateCallback<Object>() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                String hql = "update User u set u.LastLoginIp=?,u.LastLoginTime=? where u.id=?";
                Query query = session.createQuery(hql);
                query.setString(0,loginIp);
                query.setLong(1,loginTime);
                query.setInteger(2,id);
                return query.executeUpdate();
            }
        });
    }
}
