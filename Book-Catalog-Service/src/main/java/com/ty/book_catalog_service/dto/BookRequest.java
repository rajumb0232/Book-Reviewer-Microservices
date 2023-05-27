package com.ty.book_catalog_service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookRequest {
	
	private String title;
	private String description;
	private String genre;
	private int pages;
}
