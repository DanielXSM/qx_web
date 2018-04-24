package com.qx.qx.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @program: qx
 * @description:页面跳转
 * @author:Daniel.zhao
 * @create:2018-04-24 15:57
 **/
@Controller
@EnableAutoConfiguration
public class PageTo {
    @RequestMapping("/to_contact")
    public ModelAndView toHome(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView=new ModelAndView();
        Map<String,Object> modelmap=modelAndView.getModel();
        modelAndView.setViewName("contact");
        System.out.println("666666");
        return modelAndView;
    }

    @RequestMapping("/to_team")
    public ModelAndView toTeam(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView=new ModelAndView();
        Map<String,Object> modelmap=modelAndView.getModel();
        modelAndView.setViewName("team");
        System.out.println("666666");
        return modelAndView;
    }

    @RequestMapping("/to_withus")
    public ModelAndView towithUs(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView=new ModelAndView();
        Map<String,Object> modelmap=modelAndView.getModel();
        modelAndView.setViewName("withus");
        System.out.println("666666");
        return modelAndView;
    }
}
