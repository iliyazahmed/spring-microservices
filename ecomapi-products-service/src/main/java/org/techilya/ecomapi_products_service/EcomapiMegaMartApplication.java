package org.techilya.ecomapi_products_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EcomapiMegaMartApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomapiMegaMartApplication.class, args);
	}

}