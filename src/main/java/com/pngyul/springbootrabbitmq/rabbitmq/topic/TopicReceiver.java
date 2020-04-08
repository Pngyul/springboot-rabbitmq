package com.pngyul.springbootrabbitmq.rabbitmq.topic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.message")
@Slf4j
public class TopicReceiver {

    @RabbitHandler
    public void process(String message) {
        log.info("Topic Receiver1  : {}",message);
    }

}
