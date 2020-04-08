package com.pngyul.springbootrabbitmq.rabbitmq.direct;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "directB")
@Slf4j
public class DirectReceiver2 {

    @RabbitHandler
    public void process(String message) {
        log.info("Topic ReceiverA  : {}",message);
    }

}
