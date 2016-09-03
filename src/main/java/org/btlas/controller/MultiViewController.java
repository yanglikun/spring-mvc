package org.btlas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yanglikun on 2016/9/2.
 */
@Controller
@RequestMapping("/multiView")
public class MultiViewController {

    @RequestMapping("/jspTest")
    public String jsp(String name, ModelMap model) {
        model.addAttribute("name", name);
        return "index.jsp";
    }

    @RequestMapping("/velocityTest")
    public String velocity(String name, ModelMap model) {
        model.addAttribute("name", name);
        return "index.vm";
    }

}
