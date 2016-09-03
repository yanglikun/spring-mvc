package org.btlas.controller;

import org.btlas.vo.customviewtype.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by yanglikun on 2016/9/1.
 */
@Controller
@RequestMapping("/customViewType")
public class CustomViewTypeController {

    @RequestMapping("/test")
    public User testJson() {
        User userJson = new User();
        userJson.setName("张三");
        userJson.setAge(23);
        userJson.setBirthday(new Date());
        return userJson;
    }

}
