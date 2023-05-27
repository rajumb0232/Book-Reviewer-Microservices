package com.ty.user_service.service;

import java.time.LocalDate;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ty.user_service.dao.UserDao;
import com.ty.user_service.dto.UserRequest;
import com.ty.user_service.dto.UserResponse;
import com.ty.user_service.entity.User;
import com.ty.user_service.enums.userRole;
import com.ty.user_service.exception.UserNotFoundByIdException;

@Service
public class UserService {
	
	@Autowired
	private UserDao dao;
	@Autowired
	private ModelMapper mapper;
	
	public ResponseEntity<UserResponse> saveUser(UserRequest userRequest, userRole role){
		User user = this.mapper.map(userRequest, User.class);
		user.setUserRegistrationDate(LocalDate.now());
		user.setUserRole(role);
		user = dao.saveUser(user);
		
		UserResponse response = this.mapper.map(user, UserResponse.class);
		
		return new ResponseEntity<UserResponse>(response, HttpStatus.CREATED);
	}
	
	public ResponseEntity<UserResponse> getUserById(int userId){
		Optional<User> optional = dao.getUserById(userId);
		if(optional.isPresent()) {
			UserResponse response = this.mapper.map(optional.get(), UserResponse.class);
			return new ResponseEntity<UserResponse> (response, HttpStatus.FOUND);
		}else {
			throw new UserNotFoundByIdException("Failed to find User!!");
		}
	}
}
