package junit.test;

import com.jar.domain.Message;
import com.jar.service.ArticleService;
import com.jar.service.MessageService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuzw_000 on 2015/9/6.
 */
public class testMessage {


    @Test
    public void testAdd(){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        MessageService messageService = (MessageService) ctx.getBean("messageService");

        Message message = new Message();
        message.setUsername("1");
        message.setEditTime(1);
        message.setMessage("1");
        message.setOwner("1");
        messageService.add(message);

    }


    @Test
    public void testShow(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        MessageService messageService = (MessageService) ctx.getBean("messageService");

        List<Message> list = new ArrayList<Message>();

        list = messageService.show();

        for(Message m:list){
            System.out.println(m.getMessage());
        }

    }

}
