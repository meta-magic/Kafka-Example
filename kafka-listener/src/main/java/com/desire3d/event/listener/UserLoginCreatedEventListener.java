package com.desire3d.event.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.desire3d.channel.LoginCreationChannel;
import com.desire3d.event.UserLoginCreatedEvent;

/**
 * @author Mahesh Pardeshi
 *
 */
@Component

public class UserLoginCreatedEventListener {

	private final Logger logger = LoggerFactory.getLogger(UserLoginCreatedEventListener.class);

	@StreamListener(LoginCreationChannel.LOGIN_CREATION_INPUT)
	public void listen(Message<UserLoginCreatedEvent> message) {
		logger.info("Message '{}' received ", message);
	}
}