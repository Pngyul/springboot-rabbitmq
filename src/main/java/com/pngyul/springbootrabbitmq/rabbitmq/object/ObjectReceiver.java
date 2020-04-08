package com.pngyul.springbootrabbitmq.rabbitmq.object;

import com.pngyul.springbootrabbitmq.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "object")
@Slf4j
public class ObjectReceiver {

    @RabbitHandler
    public void process(User user) {
        log.info("Receiver object : ",user);
        System.out.println("Receiver object : " + user);
    }

}
