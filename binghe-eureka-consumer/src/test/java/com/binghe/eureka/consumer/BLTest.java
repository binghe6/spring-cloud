package com.binghe.eureka.consumer;

import java.text.MessageFormat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BLTest {

	@Autowired
	private LoadBalancerClient loadBalancerClient;

	/**
	 * 测试ribbon负载均衡策略
	 */
	@Test
	public void test() {
		for (int i = 0; i < 50; i++) {
			ServiceInstance instance = loadBalancerClient.choose("binghe-eureka-provider");
			System.out.println(MessageFormat.format("第{0}次, IP:{1}, PORT:{2}", i, instance.getHost(), instance.getPort()));
		}
	}
}
