package org.btlas.controller;

import org.btlas.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yanglikun on 2016/8/25.
 */
@Controller
@RequestMapping("/msgConvert")
public class MessageConvertController {

    @RequestMapping("/convert")
    public
    @ResponseBody
    User messageConvert(@RequestBody User user, HttpServletRequest req) {
        user.setName(user.getName() + ":add");
        return user;
    }

}
