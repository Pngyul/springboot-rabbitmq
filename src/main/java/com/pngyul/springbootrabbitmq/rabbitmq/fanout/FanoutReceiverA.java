package com.pngyul.springbootrabbitmq.rabbitmq.fanout;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanoutA")
@Slf4j
public class FanoutReceiverA {

    @RabbitHandler
    public void process(String message) {
        log.info("fanout Receiver A  : {}",message);
    }

}
