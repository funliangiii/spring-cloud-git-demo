package com.cloud.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController{
    @RequestMapping("/hi/{name}")
    @ResponseBody
    public String sayHi(@PathVariable String name) throws  Exception{
        Thread.sleep(3000);
        return name+" say hi to client1,这是6002";
    }
}
