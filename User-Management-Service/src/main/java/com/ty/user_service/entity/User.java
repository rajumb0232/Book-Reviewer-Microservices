package com.ty.user_service.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ty.user_service.enums.userRole;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private String userPhNo;
	private String userEmail;
	private String userPassword;
	private LocalDate userRegistrationDate;
	private userRole userRole;
}
