package org.btlas.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcCustomerDAO {

    private JdbcTemplate jdbcTemplate;

    public void save(Customer customer) {
        jdbcTemplate.update("insert into t_customer(name,age) value (?,?)", customer.getName(), customer.getAge());
    }


    public void save1(Customer customer) {
        jdbcTemplate.execute("insert into t_customer(name,age) value ('name-2',20)");
    }


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}