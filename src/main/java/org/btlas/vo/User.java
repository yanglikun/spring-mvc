package org.btlas.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by yanglikun on 2016/8/23.
 */
public class User {

    private String name;

    private Integer age;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public  interface ValidatorGroup {
        interface Save {
        }

        interface Query {
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
