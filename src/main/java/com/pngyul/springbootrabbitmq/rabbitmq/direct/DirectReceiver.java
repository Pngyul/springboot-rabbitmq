package com.pngyul.springbootrabbitmq.rabbitmq.direct;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "directA")
@Slf4j
public class DirectReceiver {

    @RabbitHandler
    public void process(String message) {
        log.info("Topic ReceiverA  : {}",message);
    }

}
