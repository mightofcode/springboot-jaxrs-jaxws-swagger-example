package com.mocyx.springbootjaxrsjaxwsswaggerexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/api/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello() {
        return "HelloController";
    }
}
