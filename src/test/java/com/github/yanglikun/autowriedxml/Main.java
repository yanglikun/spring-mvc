package com.github.yanglikun.autowriedxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-autowiredxml.xml");
        UserService userService = ctx.getBean("userService", UserService.class);
        userService.save();
    }

}
