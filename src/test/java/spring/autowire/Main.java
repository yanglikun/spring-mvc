package spring.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.autowire.vo.User;

/**
 * Created by yanglikun on 2016/10/24.
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-test.xml");
        User user = ctx.getBean("user", User.class);
        System.out.println(user);
    }
}
