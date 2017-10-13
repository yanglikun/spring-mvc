package com.github.yanglikun.autowriedxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void save() {
        System.out.println("userService调用dao保存：" + userDao);
    }
}
