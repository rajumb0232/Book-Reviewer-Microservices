package com.ty.user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.user_service.dto.UserRequest;
import com.ty.user_service.dto.UserResponse;
import com.ty.user_service.enums.userRole;
import com.ty.user_service.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping
	public ResponseEntity<UserResponse> saveUser(
			@RequestBody UserRequest userRequest, @RequestParam userRole userRole){
		return service.saveUser(userRequest, userRole);
	}
	
	@GetMapping("/userId/{userId}")
	public ResponseEntity<UserResponse> getUserById(@PathVariable int userId){
		return service.getUserById(userId);
	}
}
