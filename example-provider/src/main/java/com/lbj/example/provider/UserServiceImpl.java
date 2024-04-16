package com.lbj.example.provider;

import com.lbj.example.common.model.User;
import com.lbj.example.common.service.UserService;

public class UserServiceImpl implements UserService{

    @Override
    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
