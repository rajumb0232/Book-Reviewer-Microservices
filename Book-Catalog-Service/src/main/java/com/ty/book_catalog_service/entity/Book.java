package com.ty.book_catalog_service.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Book {

	@Id
	private int bookId;
	private String title;
	private String description;
	private String genre;
	private int pages;
}
