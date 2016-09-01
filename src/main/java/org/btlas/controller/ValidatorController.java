package org.btlas.controller;

import org.btlas.vo.validate.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by yanglikun on 2016/8/30.
 */
@Controller
@RequestMapping("/validate")
public class ValidatorController {

    @RequestMapping("/test")
    public String test(@Validated User myUser, BindingResult userBR, ModelMap model) {
        model.put("user", myUser);
        printBindingResult(userBR);
        return "validate";
    }

    @RequestMapping("/save")
    public String save(@ModelAttribute("myUser") @Validated(org.btlas.vo.User.ValidatorGroup.Save.class) User user, BindingResult userBR, ModelMap model) {
        model.put("user", user);
        model.put("org.springframework.validation.BindingResult.userValidateRet", userBR);
        printBindingResult(userBR);
        System.out.println("=============" + userBR.hasErrors());
        return "validate";
    }

    @RequestMapping("/query")
    public String query(@Validated(org.btlas.vo.User.ValidatorGroup.Query.class) User user, BindingResult userBR, ModelMap model) {
        printBindingResult(userBR);
        return "validate";
    }


    private void printBindingResult(BindingResult userBR) {
        if (userBR.hasErrors()) {
            List<FieldError> fieldErrors = userBR.getFieldErrors();
            System.out.println("错误数：" + userBR.getErrorCount()); //错误数：2
            for (FieldError fieldError : fieldErrors) {
                System.out.println(fieldError.getDefaultMessage());//输出注解的message值
            }
            if (userBR.getFieldError("age") != null) {
                System.out.println(userBR.getFieldError("age").getDefaultMessage());//姓名不能为空
            }
        }
    }


}
