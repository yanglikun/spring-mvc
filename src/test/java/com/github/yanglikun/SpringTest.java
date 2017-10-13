package com.github.yanglikun;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.autowire.vo.User;


public class SpringTest {

    @Test
    public void test1() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-test.xml");
        Object user = ctx.getBean("user");
        System.out.println(user);
    }

}
