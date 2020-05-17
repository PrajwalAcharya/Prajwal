package com.example.lwcurrencyconvert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LwCurrencyconvertApplication {

	public static void main(String[] args) {
		SpringApplication.run(LwCurrencyconvertApplication.class, args);
	}

}
