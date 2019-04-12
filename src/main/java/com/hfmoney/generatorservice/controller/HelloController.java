package com.hfmoney.generatorservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: gaojun
 * @date: 2019/3/27 15:13
 * @description:
 */
@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "/hello";
    }

}
