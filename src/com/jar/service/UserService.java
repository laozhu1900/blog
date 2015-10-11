package com.jar.service;

import com.jar.domain.User;

/**
 * Created by zhuzw_000 on 2015/8/20.
 */
public interface UserService {

    void add(User user) ;

    User login(String username,String password);

    User findEmail(String email);

    void updateLoginIpAndTime(String loginIp,long loginTime,int id);
}
