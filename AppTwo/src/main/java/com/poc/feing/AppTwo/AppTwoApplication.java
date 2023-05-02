package com.poc.feing.AppTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppTwoApplication.class, args);
	}

}
