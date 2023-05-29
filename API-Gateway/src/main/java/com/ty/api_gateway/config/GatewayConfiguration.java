package com.ty.api_gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {
	
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("user-management-service", r -> r.path("/user/**")
						.uri("lb://user-management-service"))
				
				.route("review-service", r -> r.path("/review/**")
						.uri("lb://review-service"))
				
				.route("book-catalog-service", r -> r.path("/book/**")
						.uri("lb://book-catalog-service"))
				
				.build();
	}
}
