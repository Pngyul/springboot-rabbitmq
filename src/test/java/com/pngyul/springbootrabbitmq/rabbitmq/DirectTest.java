package com.pngyul.springbootrabbitmq.rabbitmq;

import com.pngyul.springbootrabbitmq.rabbitmq.direct.DirectSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DirectTest {

	@Autowired
	private DirectSender sender;

	@Test
	public void topic() throws Exception {
		sender.sendA();
	}

	@Test
	public void topic1() throws Exception {
		sender.sendB();
	}


}