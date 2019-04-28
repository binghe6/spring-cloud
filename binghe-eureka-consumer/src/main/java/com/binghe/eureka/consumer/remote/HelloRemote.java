package com.binghe.eureka.consumer.remote;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.binghe.eureka.consumer.hystrix.HelloRemoteHystrix;

/**
 * 服务提供方的接口
 * @author dongsw
 *
 */
@FeignClient(name= "binghe-eureka-provider", fallback=HelloRemoteHystrix.class)
public interface HelloRemote {
    
	/**
	 * (此处的@RequestParam必须要加，否则无法将参数传到服务方的接口)
	 * @param id
	 * @return
	 */
	@PostMapping(value = "/hello")
    public Map<String, Object> hello(@RequestParam("id") String id);
}