package com.github.yanglikun.autoset;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-test-autoset.xml");
        Object a = ctx.getBean("a");
        System.out.println(a);
    }
}
