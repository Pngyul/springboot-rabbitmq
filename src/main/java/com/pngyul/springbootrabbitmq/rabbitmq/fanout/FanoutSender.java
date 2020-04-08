package com.pngyul.springbootrabbitmq.rabbitmq.fanout;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FanoutSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send() {
		String context = "hi, fanout msg ";
		log.info("Sender : {}",context);
		this.rabbitTemplate.convertAndSend("fanoutExchange","sui.bain.xie", context);
	}

}