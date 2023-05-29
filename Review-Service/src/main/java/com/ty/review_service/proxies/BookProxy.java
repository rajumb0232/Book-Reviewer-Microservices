package com.ty.review_service.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "book-catalog-service")
public interface BookProxy {
	
	@GetMapping("/book/check/{bookId}")
	public Boolean checkForPresence(@PathVariable int bookId);
}
