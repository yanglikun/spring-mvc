package org.btlas.jdbc;

import java.sql.Timestamp;

/**
 * <code>
 * CREATE TABLE `t_customer` (
 * `id` INT(11) NOT NULL AUTO_INCREMENT,
 * `name` VARCHAR(50) NULL DEFAULT NULL COMMENT '50',
 * `age` INT(11) NULL DEFAULT NULL,
 * INDEX `pk` (`id`)
 * )
 * ENGINE=InnoDB
 * ;
 * <p>
 * </code>
 */
public class Customer {

    private int id;

    private String name;

    private int age;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}