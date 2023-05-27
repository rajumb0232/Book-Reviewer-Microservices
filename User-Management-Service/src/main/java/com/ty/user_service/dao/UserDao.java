package com.ty.user_service.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.user_service.entity.User;
import com.ty.user_service.repository.UserRepository;

@Repository
public class UserDao {
	
	@Autowired
	private UserRepository repository;
	
	public User saveUser(User user) {
		return repository.save(user);
	}
	
	public Optional<User> getUserById(int userId) {
		return repository.findById(userId);
	}
}
