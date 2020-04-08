package com.pngyul.springbootrabbitmq.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Bean
    public Queue queue(){
        return new Queue("hello");
    }

    @Bean
    public Queue pngyulQueue() {
        return new Queue("pngyul");
    }

    @Bean
    public Queue objectQueue() {
        return new Queue("object");
    }
}
