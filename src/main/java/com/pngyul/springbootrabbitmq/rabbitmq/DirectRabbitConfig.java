package com.pngyul.springbootrabbitmq.rabbitmq;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Direct Exchange 是 RabbitMQ 默认的交换机模式，
 * 也是最简单的模式，根据Rountingkey全文匹配去寻找对应队列
 */


@Configuration
public class DirectRabbitConfig {

    @Bean
    public Queue directQueueA() {
        return new Queue("directA");
    }

    @Bean
    public Queue directQueueB() {
        return new Queue("directB");
    }

    @Bean
    DirectExchange directExchange() {
        return new DirectExchange("directExchange");
    }

    @Bean
    Binding bindingExchangeDirectA(Queue directQueueA, DirectExchange directExchange) {
        return BindingBuilder.bind(directQueueA).to(directExchange).with("pngyulA");
    }

    @Bean
    Binding bindingExchangeDirectB(Queue directQueueB, DirectExchange directExchange) {
        return BindingBuilder.bind(directQueueB).to(directExchange).with("pngyulB");
    }

}
