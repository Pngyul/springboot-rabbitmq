package com.pngyul.springbootrabbitmq.rabbitmq.many;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Sender2 {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send(int i) {
		String context = "spirng boot pngyul queue"+" ****** "+i;
		log.info("Sender2 :{}",context);
		this.rabbitTemplate.convertAndSend("pngyul", context);
	}

}