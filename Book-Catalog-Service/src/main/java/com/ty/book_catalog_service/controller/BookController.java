package com.ty.book_catalog_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.book_catalog_service.dto.BookRequest;
import com.ty.book_catalog_service.dto.BookResponse;
import com.ty.book_catalog_service.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping
	public ResponseEntity<BookResponse> saveBook(
			@RequestBody BookRequest bookRequest){
		return bookService.saveBook(bookRequest);
	}
	
	@GetMapping("/bookId/{bookId}")
	public ResponseEntity<BookResponse> getBookById(
			@PathVariable int bookId){
		return bookService.getBookById(bookId);
	}
	
}
