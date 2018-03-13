package com.my.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 30706 on 2018/3/13.
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String testHello(@RequestParam String name){
        return "第二服务获取的name："+name;
    }

}
