package com.xfc.order.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user-service", fallback = UserServiceFuse.class)
public interface UserService {
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

}
