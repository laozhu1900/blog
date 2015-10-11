package com.jar.controller;

import com.jar.domain.Message;
import com.jar.service.MessageService;
import com.jar.util.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuzw_000 on 2015/9/6.
 */
@Controller
@RequestMapping("/message")
public class MessageController {


    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/")
    public String message(Model model){

        List<Message> list = new ArrayList<Message>();

        list = messageService.show();

        model.addAttribute("msg",list);

        return "message/message";
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(String username,String message){

        Message m = new Message();
        m.setOwner(username);
        m.setEditTime(new Tools().getCurrentTime());
        m.setUsername(username);
        m.setMessage(message);

        messageService.add(m);

        return "redirect:./";

    }
}
