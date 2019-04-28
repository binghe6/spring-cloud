package com.binghe.eureka.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy// 启用zuul
public class EurekaZuulApp {

	public static void main(String[] args) {
		SpringApplication.run(EurekaZuulApp.class, args);
	}
}
