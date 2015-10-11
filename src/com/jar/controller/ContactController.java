package com.jar.controller;



import com.jar.domain.Contact;
import com.jar.service.ContactService;
import com.jar.util.Tools;
import com.jar.util.mail.MailSend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhuzw_000 on 2015/8/22.
 */

@Controller
@RequestMapping("/contact")
public class ContactController {


    @Autowired
    private ContactService contactService;

    @RequestMapping("/")
    public String contact(){

        return "contact/contact";
    }


    @RequestMapping("/call")
    public String addAdvice(String username,String email,String web,String advice,Model model){

        Contact c = new Contact();
        c.setAdvice(advice);
        c.setUsername(username);
        c.setEmail(email);
        c.setWeb(web);
        c.setEditTime(new Tools().getCurrentTime());
        contactService.add(c);

        new MailSend().contactMe(email,advice,username,web);

        model.addAttribute("contactMsg","感谢您的参与，我们会尽快查看及与您联系，祝您生活愉快");

        return "redirect:./";

    }

}
