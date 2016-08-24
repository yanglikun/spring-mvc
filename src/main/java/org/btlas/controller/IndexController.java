package org.btlas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yanglikun on 2016/8/18.
 */
@Controller
public class IndexController {

    @RequestMapping("/myIndex")
    public String index() {
        return "index";
    }
}
