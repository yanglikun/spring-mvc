package org.btlas.vo.validate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by yanglikun on 2016/8/23.
 */
public class User {

    @NotNull(message = "姓名不能为空", groups = {org.btlas.vo.User.ValidatorGroup.Query.class, org.btlas.vo.User.ValidatorGroup.Save.class})
    private String name;

    @Min(value = 18, message = "年龄不能小于18", groups = {org.btlas.vo.User.ValidatorGroup.Save.class})
    @NotNull(message = "年龄不能为空", groups = {org.btlas.vo.User.ValidatorGroup.Save.class})
    private Integer age;

    @NotNull(message = "{NotNull.user.birthday.test}")
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
