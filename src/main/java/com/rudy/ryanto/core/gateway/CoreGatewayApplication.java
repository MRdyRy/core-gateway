package com.rudy.ryanto.core.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CoreGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreGatewayApplication.class, args);
	}

}
