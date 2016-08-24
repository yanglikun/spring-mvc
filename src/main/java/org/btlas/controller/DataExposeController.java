package org.btlas.controller;

import org.btlas.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yanglikun on 2016/8/24.
 */
@Controller
@RequestMapping("/dataExpose")
public class DataExposeController {

    @RequestMapping("/modelAndView")
    public ModelAndView modelAndView(ModelAndView mv) {
        mv.addObject("name", "modelAndView Data");
        mv.setViewName("dataExpose");
        return mv;
    }

    /**
     * 这里的Model类型可以是Map，也可以是ModelMap
     */
    @RequestMapping("/model")
    public String model(Model model) {
        model.addAttribute("name", "model Data");
        return "dataExpose";
    }


    @RequestMapping("/modelAttribute")
    public String modelAttribute(@ModelAttribute("user") User userParam) {
        userParam.setAge(30);
        return "dataExpose";
    }


    /**
     * 默认会把参数类型简单名称首字母小写作为属性放置到request中
     *
     * @param userParam
     * @return
     */
    @RequestMapping("/defaultTest")
    public String defaultTest(User userParam, Long id) {
        userParam.setAge(30);
        return "dataExpose";
    }


    @RequestMapping("/invalidSession")
    public String invalidSession(HttpServletRequest req) {
        req.getSession().invalidate();
        return "dataExpose";
    }


}
