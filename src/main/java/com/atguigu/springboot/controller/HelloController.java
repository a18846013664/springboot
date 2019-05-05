package com.atguigu.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
   /* @Value("${person.lastName}")
    private String name;
    @ResponseBody
    @RequestMapping("/sayhello")
    public String sayHallo(){
        return "hello"+name;
    }*/
}
