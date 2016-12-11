package com.example.hello.controller;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by Administrator on 2016/12/6.
 */
@RestController
@EnableAutoConfiguration
public class HelloWorld {

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String index(){
        return "Hello,Welcome to SpringBoot World";
    }
}
