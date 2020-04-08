package com.pngyul.springbootrabbitmq.rabbitmq.object;

import com.pngyul.springbootrabbitmq.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 传输对象
 */

@Component
@Slf4j
public class ObjectSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send(User user) {
		log.info("Sender object: {}",user.toString());
		this.rabbitTemplate.convertAndSend("object", user);
	}

}