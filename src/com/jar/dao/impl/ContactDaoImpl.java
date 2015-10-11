package com.jar.dao.impl;

import com.jar.dao.ContactDao;

import com.jar.domain.Contact;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by zhuzw_000 on 2015/9/6.
 */
public class ContactDaoImpl extends HibernateDaoSupport implements ContactDao,HibernateCallback {

    public void add(Contact contact) {
        this.getHibernateTemplate().save(contact);
    }

    public Object doInHibernate(Session session) throws HibernateException {
        return null;
    }
}
