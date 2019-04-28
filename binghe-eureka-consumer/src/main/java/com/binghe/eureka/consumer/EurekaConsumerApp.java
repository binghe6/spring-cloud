package com.binghe.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableHystrix// 启用hystrix
@SpringBootApplication
@EnableDiscoveryClient// 启用服务发现
@EnableFeignClients
public class EurekaConsumerApp {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerApp.class, args);
	}
}
