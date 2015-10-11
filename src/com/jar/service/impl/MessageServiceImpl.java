package com.jar.service.impl;

import com.jar.dao.MessageDao;
import com.jar.domain.Message;
import com.jar.service.MessageService;

import java.util.List;

/**
 * Created by zhuzw_000 on 2015/9/6.
 */
public class MessageServiceImpl implements MessageService {

    private MessageDao messageDao;

    public void setMessageDao(MessageDao messageDao) {
        this.messageDao = messageDao;
    }

    public void add(Message message) {
        messageDao.add(message);
    }

    public List<Message> show() {
        return messageDao.show();
    }
}
