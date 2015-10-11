package junit.test;

import com.jar.domain.User;
import com.jar.service.UserService;
import com.jar.util.Tools;
import com.jar.util.mail.MailSend;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhuzw_000 on 2015/8/21.
 */
public class testUser {

    @Test
    public void testAdd()throws  Exception{

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        User user = new User();

        user.setUsername("admin");
        user.setEmail("admin");
        user.setPassword("admin");

        userService.add(user);

    }

    @Test
    public void testLogin(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        User user = new User();

        user = userService.login("111111","111111");

        System.out.println(user.getEmail());

    }

    @Test
    public void testFindEmail(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");

        User user = new User();

        user = userService.findEmail("zzw865@qq.com");

        System.out.print(user.getEmail());

    }

    @Test
    public void testSendMail(){
        new MailSend().send("zhuzw0929@163.com", new Tools().makeEmailVerifyode());

    }
}
