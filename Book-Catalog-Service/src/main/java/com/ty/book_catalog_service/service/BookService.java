package com.ty.book_catalog_service.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ty.book_catalog_service.dao.BookDao;
import com.ty.book_catalog_service.dto.BookRequest;
import com.ty.book_catalog_service.dto.BookResponse;
import com.ty.book_catalog_service.entity.Book;
import com.ty.book_catalog_service.exception.BookNotFoundByIdException;

@Service
public class BookService {
	
	@Autowired
	private BookDao dao;
	@Autowired
	private ModelMapper mapper;
	
	public ResponseEntity<BookResponse> saveBook(BookRequest bookRequest){
		Book book = this.mapper.map(bookRequest, Book.class);
		book = dao.saveBook(book);
		BookResponse response = this.mapper.map(book, BookResponse.class);
		return new ResponseEntity<BookResponse> (response, HttpStatus.CREATED);
	}
	
	public ResponseEntity<BookResponse> getBookById(int bookId){
		Optional<Book> optional = dao.getBookById(bookId);
		if(optional.isPresent()) {
			BookResponse response = this.mapper.map(optional.get(), BookResponse.class);
			return new ResponseEntity<BookResponse> (response, HttpStatus.FOUND);
		}else {
			return null;
		}
	}

	public Boolean checkForPresence(int bookId) {
		Optional<Book> optional = dao.getBookById(bookId);
		if(optional.isPresent()) {
			return true;
		}else {
			throw new BookNotFoundByIdException("Failed to find the Book!!");
		}
	}
}
