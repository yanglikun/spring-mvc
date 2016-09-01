package org.btlas.controller;

import org.btlas.vo.customviewtype.UserJson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by yanglikun on 2016/9/1.
 */
@Controller
@RequestMapping("/customViewType")
public class CustomViewTypeController {

    @RequestMapping("/testJson")
    public UserJson testJson() {
        UserJson userJson = new UserJson();
        userJson.setName("张三");
        userJson.setAge(23);
        userJson.setBirthday(new Date());
        return userJson;
    }

}
