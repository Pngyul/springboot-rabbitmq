package com.pngyul.springbootrabbitmq.rabbitmq.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 最简单模式，传输字符串
 */

@Component
@Slf4j
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello pngyul " + new Date();
        log.info("Sender: {}",context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }
}
