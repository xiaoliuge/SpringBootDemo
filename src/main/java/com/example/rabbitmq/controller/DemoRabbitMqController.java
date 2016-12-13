package com.example.rabbitmq.controller;
import io.swagger.annotations.ApiOperation;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.core.dto.ResultDataDto;
import com.example.rabbitmq.sender.DemoRabbitMqSender;
/**
 * Created by Administrator on 2016/12/13.
 */
/**
 * 测试Rabbit MQ
 */
@RestController
@RequestMapping(value="/rabbitmq")
public class DemoRabbitMqController {

    @Autowired
    private DemoRabbitMqSender demoRabbitMqSender;

    /**
     * 发送测试消息队列
     */
    @ApiOperation(value="发送测试消息队列", notes="addEntity")
    @RequestMapping(value = "/addRabbitMq", method = RequestMethod.GET)
    public @ResponseBody ResultDataDto addEntity(HttpSession httpSession) {
        demoRabbitMqSender.send("你是我的眼，在我********");
        return ResultDataDto.addAddSuccess();
    }

}
