package junit.test;

import com.jar.domain.Contact;
import com.jar.service.ContactService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhuzw_000 on 2015/9/6.
 */
public class testContact {


    @Test
    public void testAdvice(){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ContactService contactService = (ContactService) ctx.getBean("contactService");

        Contact advice = new Contact();

        advice.setEditTime(1);
        advice.setAdvice("1");
        advice.setWeb("1");
        advice.setEmail("1");
        advice.setUsername("1");

        contactService.add(advice);

    }
}
