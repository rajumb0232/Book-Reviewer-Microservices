package com.ty.user_service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {
	
	private String userName;
	private String userPhNo;
	private String userEmail;
	private String userPassword;
}
