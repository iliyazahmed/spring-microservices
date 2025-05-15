package com.techilya.ecomapi_customer_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EcomapiCustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomapiCustomerServiceApplication.class, args);
	}

}
