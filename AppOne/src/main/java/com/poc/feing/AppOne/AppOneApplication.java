package com.poc.feing.AppOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppOneApplication.class, args);
	}

}
