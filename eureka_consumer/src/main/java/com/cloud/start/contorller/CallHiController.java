package com.cloud.start.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class CallHiController {
    @Autowired
    private RestTemplate restTemplate;
    @ResponseBody
    @RequestMapping("/call/{name}")
    public String callHi(@PathVariable String name){
        System.out.println("从eureka_client2调用eureka_client1，参数是："+name);
        return restTemplate.getForObject("http://eureka-client1/hi/"+name+"",String.class);
    }
}
