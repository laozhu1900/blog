package com.jar.domain;

import java.awt.*;
import java.io.Serializable;
import java.sql.Blob;

/**
 * Created by zhuzw_000 on 2015/8/19.
 */
public class User implements Serializable{

//    user£ºid£¬username,nickname£¬password,sex,birthday,register_date,last_login_ip,last_login_time,
//    authority,email,head_pic,user_desc,
//    tellphone,

    private int id;
    private String username;
    private String password;
    private String email;
    private String sex;
    private long birthday;
    private long registerTime;
    private long LastLoginTime;
    private String LastLoginIp;
    private String authority;
    private int cellphone;
    private Blob headPic;
    private String userDesc;
    private int emailVerifyCode;

    public int getEmailVerifyCode() {
        return emailVerifyCode;
    }

    public void setEmailVerifyCode(int emailVerifyCode) {
        this.emailVerifyCode = emailVerifyCode;
    }

    public int getCellphone() {
        return cellphone;
    }

    public void setCellphone(int cellphone) {
        this.cellphone = cellphone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

     public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public long getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(long registerTime) {
        this.registerTime = registerTime;
    }

    public long getLastLoginTime() {
        return LastLoginTime;
    }

    public void setLastLoginTime(long lastLoginTime) {
        LastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return LastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        LastLoginIp = lastLoginIp;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Blob getHeadPic() {
        return headPic;
    }

    public void setHeadPic(Blob headPic) {
        this.headPic = headPic;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }
}
