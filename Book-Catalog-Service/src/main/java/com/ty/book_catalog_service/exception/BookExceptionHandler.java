package com.ty.book_catalog_service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BookExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<String> BookNotFoundById(BookNotFoundByIdException ex){
		return new ResponseEntity<String> (ex.getMessage()+
				" / Book is not Present with the requested Id!!", 
				HttpStatus.NOT_FOUND);
	}
}
