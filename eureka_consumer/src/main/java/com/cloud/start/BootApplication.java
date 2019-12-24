package com.cloud.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BootApplication {
    public  static void main(String[] args){
        SpringApplication.run(BootApplication.class,args);
    }
    //使用RestTemplate对服务提供者发请求
    @LoadBalanced()
    @Bean()
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
