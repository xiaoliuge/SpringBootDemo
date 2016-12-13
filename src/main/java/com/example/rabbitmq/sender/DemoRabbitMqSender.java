package com.example.rabbitmq.sender;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * Created by Administrator on 2016/12/13.
 */
@Component
public class DemoRabbitMqSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(String content) {
        System.out.println("Sender : " + content);
        this.rabbitTemplate.convertAndSend("hello", content);
    }

}
