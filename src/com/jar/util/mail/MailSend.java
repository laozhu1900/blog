package com.jar.util.mail;

import com.jar.util.Tools;

/**
 * Created by zhuzw_000 on 2015/8/23.
 */
public class MailSend {

    public static void main(String[] args){

        new MailSend().send("1226093323@qq.com", new Tools().makeEmailVerifyode());

//        //�������Ҫ�������ʼ�
//        MailSenderInfo mailInfo = new MailSenderInfo();
//        mailInfo.setMailServerHost("smtp.163.com");
//        mailInfo.setMailServerPort("25");
//        mailInfo.setValidate(true);
//        mailInfo.setUserName("zhuzw0929@163.com");
//        mailInfo.setPassword("930929zzw");//������������
//        mailInfo.setFromAddress("zhuzw0929@163.com");
//        mailInfo.setToAddress("1072851751@qq.com");
//        mailInfo.setSubject("С�첩���û�ע��������֤");
//        mailInfo.setContent("�������֤��Ϊ��"+ new Tools().makeEmailVerifyode() +"</br>"+"�뾡�����ע��");
//        //�������Ҫ�������ʼ�
//        SimpleMailSender sms = new SimpleMailSender();
////         sms.sendTextMail(mailInfo);//���������ʽ
//        sms.sendHtmlMail(mailInfo);//����html��ʽ
    }

    public void send(String email,int verifyCode){
        MailSenderInfo mailInfo = new MailSenderInfo();
        mailInfo.setMailServerHost("smtp.163.com");
        mailInfo.setMailServerPort("25");
        mailInfo.setValidate(true);
        mailInfo.setUserName("zhuzw0929@163.com");
        mailInfo.setPassword("930929zzw");//������������
        mailInfo.setFromAddress("zhuzw0929@163.com");
        mailInfo.setToAddress(email);
        mailInfo.setSubject("С�첩���û�ע��������֤");
        mailInfo.setContent("�������֤��Ϊ��"+verifyCode+"&nbsp;"+"�뾡�����ע��");
        //�������Ҫ�������ʼ�
        SimpleMailSender sms = new SimpleMailSender();
//	         sms.sendTextMail(mailInfo);//���������ʽ
        sms.sendHtmlMail(mailInfo);//����html��ʽ

    }

    public void contactMe(String email,String message,String username,String web){
        MailSenderInfo mailInfo = new MailSenderInfo();
        mailInfo.setMailServerHost("smtp.163.com");
        mailInfo.setMailServerPort("25");
        mailInfo.setValidate(true);
        mailInfo.setUserName("zhuzw0929@163.com");
        mailInfo.setPassword("930929zzw");//������������
        mailInfo.setFromAddress("zhuzw0929@163.com");
        mailInfo.setToAddress("zhuzw0929@163.com");
        mailInfo.setSubject("С�첩���û�����");
        mailInfo.setContent("�û�Ϊ��"+username+"<br/>" + "���䣺"+email + "<br/ >web:" +web+"<br/>��Ϣ��"+message+"<br/>");
        //�������Ҫ�������ʼ�
        SimpleMailSender sms = new SimpleMailSender();
//	         sms.sendTextMail(mailInfo);//���������ʽ
        sms.sendHtmlMail(mailInfo);//����html��ʽ

    }
}
