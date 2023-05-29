package com.ty.review_service.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-management-service")
public interface UserProxy {
	
	@GetMapping("/user/check/{userId}")
	public Boolean checkForPresence(@PathVariable int userId);
}
