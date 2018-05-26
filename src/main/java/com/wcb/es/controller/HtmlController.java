package com.wcb.es.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HtmlController {

    @Value("${server.servlet.context-path}")
    private String contextPath;

    @RequestMapping("/goIndexHtml")
    public ModelAndView goIndexHtml() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.getModel().put("msg", "欢迎访问SpringBoot:"+contextPath+"应用！");
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
