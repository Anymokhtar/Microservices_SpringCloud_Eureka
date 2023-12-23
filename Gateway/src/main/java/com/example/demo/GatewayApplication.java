package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3000")
@SpringBootApplication
public class GatewayApplication {

	 @Bean
	    RouteLocator routes(RouteLocatorBuilder builder){
	        return builder.routes()
	                .route(r->r.path("/api/client/**").uri("lb://CLIENT-SERVICE"))
	                .route(r->r.path("/api/car/**").uri("lb://CAR-SERVICE"))
	                .build();
	    }

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
	
	

}
