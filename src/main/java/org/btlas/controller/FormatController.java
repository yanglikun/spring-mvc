package org.btlas.controller;

import org.btlas.vo.User;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by yanglikun on 2016/8/29.
 */
@Controller
@RequestMapping("/format")
public class FormatController {

    @RequestMapping("/long")
    public String longMethod(Long l) {
        System.out.println("l:" + l);
        return "dataExpose";
    }

    @RequestMapping("/longFormat")
    public String longFormat(@NumberFormat(pattern = "#,###.##") Long l) {
        System.out.println("l:" + l);
        return "dataExpose";
    }

    @RequestMapping("/date")
    public String date(Date date) {
        System.out.println("date:" + date);
        return "dataExpose";
    }

    @RequestMapping("/dateFormat")
    public String dateFormat(User user, ModelMap model) {
        System.out.println("date:" + user.getBirthday());
        model.addAttribute("user", user);
        return "dataExpose";
    }
}
