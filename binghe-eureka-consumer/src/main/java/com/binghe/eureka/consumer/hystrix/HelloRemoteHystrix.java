package com.binghe.eureka.consumer.hystrix;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.binghe.eureka.consumer.remote.HelloRemote;

@Component
public class HelloRemoteHystrix implements HelloRemote {

	@Override
	public Map<String, Object> hello(String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("msg", "异常了");
		map.put("id", id);
		return map;
	}

}
