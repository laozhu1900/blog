package com.jar.service.impl;

import com.jar.dao.ContactDao;
import com.jar.domain.Contact;
import com.jar.service.ContactService;

/**
 * Created by zhuzw_000 on 2015/9/6.
 */
public class ContactServiceImpl implements ContactService {


    private ContactDao contactDao;

    public void setContactDao(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

    public void add(Contact contact) {

        contactDao.add(contact);
    }
}
