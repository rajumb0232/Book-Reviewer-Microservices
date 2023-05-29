package com.ty.review_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.review_service.dto.ReviewRequest;
import com.ty.review_service.entity.Review;
import com.ty.review_service.service.ReviewService;

@RestController
@RequestMapping("/review")
public class ReviewController {
	
	@Autowired
	private ReviewService service;
	
	@PostMapping("/userId/{userId}/bookId/{bookId}")
	public ResponseEntity<Review> saveReview(@RequestBody ReviewRequest reviewRequest,
			@PathVariable int userId,@PathVariable int bookId){
		return service.saveReview(reviewRequest, userId, bookId);
	}
}
