package com.desire3d;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

import com.desire3d.channel.LoginCreationChannel;

@SpringBootApplication
@EnableBinding(LoginCreationChannel.class)
public class KafkaListenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaListenerApplication.class, args);
	}
}
