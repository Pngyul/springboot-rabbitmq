package com.pngyul.springbootrabbitmq.rabbitmq.topic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.messages")
@Slf4j
public class TopicReceiver2 {

    @RabbitHandler
    public void process(String message) {
        log.info("Topic Receiver2  : {}",message);
    }

}
