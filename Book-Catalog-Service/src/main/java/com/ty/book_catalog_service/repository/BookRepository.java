package com.ty.book_catalog_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.book_catalog_service.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
