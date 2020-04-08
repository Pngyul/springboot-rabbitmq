package com.pngyul.springbootrabbitmq.rabbitmq.many;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "pngyul")
@Slf4j
public class Receiver2 {

    @RabbitHandler
    public void process(String neo) {
        log.info("Receiver 2: {}",neo);
    }

}
