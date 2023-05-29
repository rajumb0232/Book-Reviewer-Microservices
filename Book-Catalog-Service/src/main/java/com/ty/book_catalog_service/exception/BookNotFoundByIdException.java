package com.ty.book_catalog_service.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@SuppressWarnings("serial")
@Getter
@AllArgsConstructor
public class BookNotFoundByIdException extends RuntimeException {
	private String message;
}
