package com.demo.dubboconsumer.controller;

import com.demo.common.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Reference(version = "1.0")
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(){
        return helloService.hello();
    }
}
