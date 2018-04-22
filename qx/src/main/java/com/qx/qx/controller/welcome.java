package com.qx.qx.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/25.
 */
@Controller
@EnableAutoConfiguration
public class welcome {

    @RequestMapping("")
    public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView=new ModelAndView();
        Map<String,Object> modelmap=modelAndView.getModel();
        modelAndView.setViewName("hello");
        System.out.println("666666");
        return modelAndView;
    }


}

