package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;




import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class VoitureApplication {
	
	@Bean
	public RestTemplate restTemplate() {return new RestTemplate();}

	public static void main(String[] args) {
		SpringApplication.run(VoitureApplication.class, args);
	}
	
	
}
