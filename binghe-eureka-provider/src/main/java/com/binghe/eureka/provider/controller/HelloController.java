package com.binghe.eureka.provider.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@PostMapping("/hello")
	public Map<String, Object> hello(String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("msg", "hello world");
		map.put("id", id);
		return map;
	}
}
