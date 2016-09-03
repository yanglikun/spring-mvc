package org.btlas.vo.customviewtype;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.Date;

/**
 * Created by yanglikun on 2016/9/1.
 */
@XStreamAlias("user")
public class User {

    private String name;

    private Integer age;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")//jackson json格式化
    @JSONField(format = "yyyy/MM/dd HH:Mm:ss") //fastjson 格式化
    private Date birthday;

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
