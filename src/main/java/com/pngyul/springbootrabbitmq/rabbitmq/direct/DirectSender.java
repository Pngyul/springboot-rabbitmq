package com.pngyul.springbootrabbitmq.rabbitmq.direct;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DirectSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void sendA() {
		String context = "hi, i am directA";
		log.info("Sender : {}",context);
		this.rabbitTemplate.convertAndSend("directExchange", "pngyulA", context);
	}

	public void sendB() {
		String context = "hi, i am directB";
		log.info("Sender : {}",context);
		this.rabbitTemplate.convertAndSend("directExchange", "pngyulB", context);
	}



}