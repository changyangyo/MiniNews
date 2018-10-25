package com.pn.wechatmini.controller;

import com.pn.wechatmini.dao.LogWebLoginDAO;
import com.pn.wechatmini.entity.Logweblogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: wechatmini
 * @description: first
 * @author: peng.ning
 * @create: 2018-10-24 10:55
 **/
@RestController
public class HelloController {
    @Autowired
    private LogWebLoginDAO logWebLoginDAO;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        List<Logweblogin> logweblogins = logWebLoginDAO.queryLogWebLogins();
        System.out.println(logweblogins.size());
        return "hello Spring Boot !";
    }
}
