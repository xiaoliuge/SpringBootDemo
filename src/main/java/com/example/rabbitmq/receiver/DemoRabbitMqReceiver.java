package com.example.rabbitmq.receiver;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
/**
 * Created by Administrator on 2016/12/13.
 */
/**
 * 消息队列接收类
 */
@Component
@RabbitListener(queues = "hello")
public class DemoRabbitMqReceiver {

    @RabbitHandler
    public void process(String content) {
        System.out.println("Receiver : " + content);
    }

}