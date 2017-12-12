package com.desire3d.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author Mahesh Pardeshi
 *
 */
public interface LoginCreationChannel {

	String LOGIN_CREATION_INPUT = "loginCreationInputChannel";

	@Input(LOGIN_CREATION_INPUT)
	SubscribableChannel loginCreationInputChannel();

}