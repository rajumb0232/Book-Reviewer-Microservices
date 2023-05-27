package com.ty.book_catalog_service.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.book_catalog_service.entity.Book;
import com.ty.book_catalog_service.repository.BookRepository;

@Repository
public class BookDao {
	
	@Autowired
	private BookRepository repository;
	
	public Book saveBook(Book book) {
		return repository.save(book);
	}
	
	public Optional<Book> getBookById(int bookId) {
		return repository.findById(bookId);
	}
}
