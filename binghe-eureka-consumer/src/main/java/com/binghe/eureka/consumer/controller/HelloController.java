package com.binghe.eureka.consumer.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.binghe.eureka.consumer.remote.HelloRemote;

@RestController
public class HelloController {

	@Autowired
	private HelloRemote helloRemote;
	
//	@HystrixCommand(fallbackMethod="helloFallbackMethod")// 配置接口调用失败时调用的方法名
	@GetMapping("/call")
	public Map<String, Object> hello(String id) {
		return helloRemote.hello(id);
	}
	
//	/**
//	 * 当hello接口调用失败的时候，hystrix会调用此方法
//	 * @param id
//	 * @return
//	 */
//	public Map<String, Object> helloFallbackMethod(String id) {
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("msg", "异常了");
//		map.put("id", id);
//		return map;
//	}
}
