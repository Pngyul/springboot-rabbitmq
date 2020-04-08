package com.pngyul.springbootrabbitmq.rabbitmq;

import com.pngyul.springbootrabbitmq.model.User;
import com.pngyul.springbootrabbitmq.rabbitmq.object.ObjectSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ObjectTest {

	@Autowired
	private ObjectSender sender;

	@Test
	public void sendOject() throws Exception {
		User user=new User();
		user.setName("pngyul");
		user.setPass("001001");
		sender.send(user);
	}

}