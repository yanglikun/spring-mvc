package org.btlas.convert;

import org.btlas.convert.annotation.UserConvertAnnotation;
import org.btlas.convert.enums.UserConvertEnum;
import org.btlas.vo.User;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.GenericConverter;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yanglikun on 2016/8/25.
 */
public class UserGenericConvert implements GenericConverter {

    public Set<ConvertiblePair> getConvertibleTypes() {
        HashSet<ConvertiblePair> set = new HashSet<ConvertiblePair>();
        set.add(new ConvertiblePair(String.class, User.class));
        return set;
    }

    public Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
        UserConvertAnnotation annotation = targetType.getAnnotation(UserConvertAnnotation.class);
        String[] split = ((String) source).split(":");
        User user = new User();
        user.setName(split[0]);
        user.setAge(Integer.valueOf(split[1]));

        if (annotation != null && annotation.value() == UserConvertEnum.ADD) {
            user.setName(user.getName() + ":add");
        }

        return user;
    }
}
