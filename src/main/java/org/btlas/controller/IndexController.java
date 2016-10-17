package org.btlas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import test.UserService;

/**
 * Created by yanglikun on 2016/8/18.
 */
@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping("/myIndex")
    public String index() {
        System.out.println(userService.query());
        return "index";
    }
}
