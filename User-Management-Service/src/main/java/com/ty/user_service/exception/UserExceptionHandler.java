package com.ty.user_service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<String> UserNotFoundById(UserNotFoundByIdException ex){
		return new ResponseEntity<String>
		(ex.getMessage()+" / User not present with the requested Id !!",
				HttpStatus.BAD_REQUEST);
	}
}
