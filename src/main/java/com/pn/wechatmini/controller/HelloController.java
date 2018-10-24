package com.pn.wechatmini.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: wechatmini
 * @description: first
 * @author: peng.ning
 * @create: 2018-10-24 10:55
 **/
@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "hello Spring Boot !";
    }
}
