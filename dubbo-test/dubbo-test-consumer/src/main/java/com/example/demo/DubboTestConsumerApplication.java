package com.example.demo;

import dubbo.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class DubboTestConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboTestConsumerApplication.class, args);
	}
}
