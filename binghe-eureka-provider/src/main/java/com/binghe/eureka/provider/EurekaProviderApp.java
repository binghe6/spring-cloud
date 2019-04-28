package com.binghe.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaProviderApp {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderApp.class, args);
	}
}
