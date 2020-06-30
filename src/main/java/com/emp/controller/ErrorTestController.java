package com.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/ErrorTest",produces = "text/html; charset=utf-8")
public class ErrorTestController {

    @RequestMapping("/test1")
    public String erroTest1(){
        int i = 2/0;
        return "ok";
    }
}
