package com.wcb.es.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HtmlController {
    @RequestMapping("/goIndexHtml")
    public ModelAndView goIndexHtml() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.getModel().put("msg", "欢迎使用SpringBoot！");
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
