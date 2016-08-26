package org.btlas.controller;

import org.btlas.convert.annotation.UserConvertAnnotation;
import org.btlas.convert.enums.UserConvertEnum;
import org.btlas.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by yanglikun on 2016/8/25.
 */
@Controller
@RequestMapping("/conversion")
public class ConversionController {

    @RequestMapping("/defaultConversion")
    public String defaultConversion(Integer i, Long l) {
        System.out.println(i + ":" + l);
        return "dataExpose";
    }

    /**
     * 访问路径
     * /conversion/customConversion?user=zs:20&l=30
     *
     * @param user
     * @param l
     * @return
     */
    @RequestMapping("/customConversion")
    public String customConversion(@UserConvertAnnotation(UserConvertEnum.ADD) User user, Long l) {
        System.out.println("user:" + user + ",l:" + l);
        return "dataExpose";
    }

    @RequestMapping("/date")
    public String customConversion(Date date) {
        System.out.println("date:" + date);
        return "dataExpose";
    }
}
