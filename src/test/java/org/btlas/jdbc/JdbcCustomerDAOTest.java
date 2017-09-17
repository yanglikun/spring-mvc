package org.btlas.jdbc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcCustomerDAOTest {

    private JdbcCustomerDAO jdbcCustomerDAO;

    @Before
    public void init() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext
                ("spring/spring-jdbc-template.xml");
        jdbcCustomerDAO = (JdbcCustomerDAO) ctx.getBean("jdbcCustomerDAO");
    }

    @Test
    public void testSave() {
        Customer customer = new Customer();
        customer.setName("name-1");
        customer.setAge(10);
        jdbcCustomerDAO.save(customer);
    }


}