package com.jar.controller;


import com.jar.Exception.CodeException;
import com.jar.Exception.UserException;
import com.jar.domain.User;
import com.jar.service.UserService;
import com.jar.util.Tools;
import com.jar.util.mail.MailSend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Created by zhuzw_000 on 2015/8/21.
 */
@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/register")
    public String register(){

        return "user/register";
    }

    @RequestMapping(value = "/verify",method = RequestMethod.POST)
    public String message(String email,String password,String username,Model model){


        System.out.println("注册的时候的email的值是：" + email);

        User user = new User();


        user.setEmail(email);
        user.setPassword(password);
        user.setUsername(username);


        int emailVerifyCode = new Tools().makeEmailVerifyode();

        user.setEmailVerifyCode(emailVerifyCode);

        MailSend send = new MailSend();

        send.send(email, emailVerifyCode);

        model.addAttribute("user",user);

        return "user/verify_email";
    }




    @RequestMapping(value = "/done",method = RequestMethod.POST)
    public String registerDone(String username,String password,String email,
                               String emailVerifyCode,String code,Model model){


        Tools tools = new Tools();

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setLastLoginIp(tools.getLocalIp());
        user.setRegisterTime(tools.getCurrentTime());
        user.setLastLoginTime(tools.getCurrentTime());

        if(code.equals(emailVerifyCode)){

            userService.add(user);

        }else{

            throw new CodeException("请输入正确的验证码");

        }

        model.addAttribute("user", user);
        return "user/register_done";
    }



    @ExceptionHandler(value={CodeException.class})
    public String verifyException(Exception ex,HttpServletRequest request) {
        request.setAttribute("ex",ex);
        return "user/verify_email";
    }

    @ExceptionHandler(value = {UserException.class})
    public String loginException(Exception ex,HttpServletRequest request){

        request.setAttribute("ex",ex);

        return "redirect:../";
    }


    @RequestMapping("/logout")
    public String logout(HttpServletRequest request,Model model){

        model.addAttribute("user","");



        return "redirect:../";

    }

    @RequestMapping(value = "/login")
    public String login(String username,String password,Model model){

        System.out.println("登陆的用户名是：" + username);
        System.out.println("登陆的密码是：" + password);

        if(username.trim().equals("")||password.trim().equals("")){
            throw new UserException("用户名或密码不能为空");
        }


        User user = new User();

        user = userService.login(username,password);

        if(user==null){
            throw new UserException("用户名或密码错误");
        }

//        userService.updateLoginIpAndTime(new Tools().getLocalIp(),new Tools().getCurrentTime(),user.getId());

        model.addAttribute("user",user);

        return "redirect:../";

    }

    @RequestMapping(value = "/v_account",method = RequestMethod.GET)
    public String v_account(HttpServletResponse response, String email){

        System.out.println("注册的email："+email);

        try {

            String responseText = "";

            User user = userService.findEmail(email);

            if(user.getEmail().equals("")){
                responseText = "done";
                PrintWriter out = response.getWriter();

                out.print(responseText);
                out.flush();
                out.close();
            }

        }catch (Exception e){
            e.printStackTrace();
        }


        return null;

    }



}
