package org.btlas.controller;

import org.btlas.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by yanglikun on 2016/8/23.
 */
@Controller
@RequestMapping("/paramBind")
public class ParamBindController {

    @RequestMapping("/test1")
    public String simple(@RequestParam("name") String name) {
        System.out.println("simple paramBind:" + name);
        return "index";
    }

    @RequestMapping("/pojo")
    public String pojo(User user) {
        System.out.println("pojo paramBind:" + user);
        return "index";
    }

    @RequestMapping("/servlet")
    public void servlet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("servlet paramBind:" + req.getRequestURI());
        resp.setContentType("text/json");
        resp.setCharacterEncoding("utf-8");
        PrintWriter writer = resp.getWriter();
        writer.write("{name:'zs'}");
        writer.close();
    }

    @RequestMapping("/url/{id}/{name}")
    public String url(@PathVariable("id") Long id, @PathVariable("name") String name) {
        System.out.println("url paramBind.id:" + id + ",name:" + name);
        return "index";
    }


    @RequestMapping("/test2")
    public
    @ResponseBody
    User messageConvert(@RequestBody User user, HttpServletRequest req) {
        user.setName(user.getName() + ":add");
        return user;
    }

}
