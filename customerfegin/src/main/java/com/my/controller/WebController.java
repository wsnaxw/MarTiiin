package com.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 30706 on 2018/3/16.
 */
@Controller
public class WebController {


    @RequestMapping("/index")
    public String helloHtml(HttpServletRequest request){

        System.out.println(request.getContextPath()+"-----------------------------------"+request.getServletPath());
        return"index";
    }

    @RequestMapping("/abc")
    public String abchtml(HttpServletRequest request){

        System.out.println(request.getContextPath()+"-----------------------------------"+request.getServletPath());
        return"abc";
    }
}
