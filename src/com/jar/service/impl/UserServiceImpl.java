package com.jar.service.impl;

import com.jar.dao.UserDao;
import com.jar.domain.User;
import com.jar.service.UserService;

/**
 * Created by zhuzw_000 on 2015/8/20.
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(User user) {
       userDao.add(user);
    }

    public User login(String username, String password) {
        return userDao.login(username,password);
    }

    public User findEmail(String email) {
        return userDao.finEmail(email);
    }

    public void updateLoginIpAndTime(String loginIp, long loginTime, int id) {
        userDao.updateLoginIpAndTime(loginIp,loginTime,id);
    }
}
