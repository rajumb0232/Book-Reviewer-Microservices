package com.ty.review_service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewRequest {
	
	private int rating;
	private String feedback;
}
