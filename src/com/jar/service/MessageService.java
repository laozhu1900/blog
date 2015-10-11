package com.jar.service;

import com.jar.domain.Message;

import java.util.List;

/**
 * Created by zhuzw_000 on 2015/9/6.
 */
public interface MessageService {

    void add(Message message);

    List<Message> show();

}
