package org.btlas.convert;

import org.btlas.vo.User;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by yanglikun on 2016/8/25.
 */
public class UserConvert implements Converter<String, User> {

    public User convert(String source) {
        String[] split = source.split(":");
        User user = new User();
        user.setName(split[0]);
        user.setAge(Integer.valueOf(split[1]));
        return user;
    }
}
