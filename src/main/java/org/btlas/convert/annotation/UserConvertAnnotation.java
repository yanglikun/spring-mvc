package org.btlas.convert.annotation;

import org.btlas.convert.enums.UserConvertEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by yanglikun on 2016/8/25.
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface UserConvertAnnotation {

    UserConvertEnum value() default UserConvertEnum.NO_ADD;
}
