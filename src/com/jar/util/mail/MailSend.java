package com.jar.util.mail;

import com.jar.util.Tools;

/**
 * Created by zhuzw_000 on 2015/8/23.
 */
public class MailSend {

    public static void main(String[] args){

        new MailSend().send("1226093323@qq.com", new Tools().makeEmailVerifyode());

//        //这个类主要是设置邮件
//        MailSenderInfo mailInfo = new MailSenderInfo();
//        mailInfo.setMailServerHost("smtp.163.com");
//        mailInfo.setMailServerPort("25");
//        mailInfo.setValidate(true);
//        mailInfo.setUserName("zhuzw0929@163.com");
//        mailInfo.setPassword("930929zzw");//您的邮箱密码
//        mailInfo.setFromAddress("zhuzw0929@163.com");
//        mailInfo.setToAddress("1072851751@qq.com");
//        mailInfo.setSubject("小朱博客用户注册邮箱验证");
//        mailInfo.setContent("邮箱的验证码为："+ new Tools().makeEmailVerifyode() +"</br>"+"请尽快完成注册");
//        //这个类主要来发送邮件
//        SimpleMailSender sms = new SimpleMailSender();
////         sms.sendTextMail(mailInfo);//发送文体格式
//        sms.sendHtmlMail(mailInfo);//发送html格式
    }

    public void send(String email,int verifyCode){
        MailSenderInfo mailInfo = new MailSenderInfo();
        mailInfo.setMailServerHost("smtp.163.com");
        mailInfo.setMailServerPort("25");
        mailInfo.setValidate(true);
        mailInfo.setUserName("zhuzw0929@163.com");
        mailInfo.setPassword("930929zzw");//您的邮箱密码
        mailInfo.setFromAddress("zhuzw0929@163.com");
        mailInfo.setToAddress(email);
        mailInfo.setSubject("小朱博客用户注册邮箱验证");
        mailInfo.setContent("邮箱的验证码为："+verifyCode+"&nbsp;"+"请尽快完成注册");
        //这个类主要来发送邮件
        SimpleMailSender sms = new SimpleMailSender();
//	         sms.sendTextMail(mailInfo);//发送文体格式
        sms.sendHtmlMail(mailInfo);//发送html格式

    }

    public void contactMe(String email,String message,String username,String web){
        MailSenderInfo mailInfo = new MailSenderInfo();
        mailInfo.setMailServerHost("smtp.163.com");
        mailInfo.setMailServerPort("25");
        mailInfo.setValidate(true);
        mailInfo.setUserName("zhuzw0929@163.com");
        mailInfo.setPassword("930929zzw");//您的邮箱密码
        mailInfo.setFromAddress("zhuzw0929@163.com");
        mailInfo.setToAddress("zhuzw0929@163.com");
        mailInfo.setSubject("小朱博客用户建议");
        mailInfo.setContent("用户为："+username+"<br/>" + "邮箱："+email + "<br/ >web:" +web+"<br/>消息："+message+"<br/>");
        //这个类主要来发送邮件
        SimpleMailSender sms = new SimpleMailSender();
//	         sms.sendTextMail(mailInfo);//发送文体格式
        sms.sendHtmlMail(mailInfo);//发送html格式

    }
}
