package com.ty.user_service.dto;

import java.time.LocalDate;

import com.ty.user_service.enums.userRole;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
	
	private int userId;
	private String userName;
	private String userPhNo;
	private String userEmail;
	private LocalDate userRegistrationDate;
	private userRole userRole;
}
