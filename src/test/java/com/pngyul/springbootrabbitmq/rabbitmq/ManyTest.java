package com.pngyul.springbootrabbitmq.rabbitmq;

import com.pngyul.springbootrabbitmq.rabbitmq.many.Sender;
import com.pngyul.springbootrabbitmq.rabbitmq.many.Sender2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyTest {
	@Autowired
	private Sender neoSender;

	@Autowired
	private Sender2 neoSender2;

	@Test
	public void oneToMany() throws Exception {
		for (int i=0;i<15;i++){
			neoSender.send(i);
		}
	}

	@Test
	public void manyToMany() throws Exception {
		for (int i=0;i<20;i++){
			neoSender.send(i);
			neoSender2.send(i);
		}
	}

}