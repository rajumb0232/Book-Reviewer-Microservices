package com.ty.review_service.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.review_service.entity.Review;
import com.ty.review_service.repository.ReviewRepository;

@Repository
public class ReviewDao  {

	@Autowired
	private ReviewRepository repository;
	
	public Review saveReview(Review review) {
		return repository.save(review);
	}
	
	public Optional<Review> getReviewById(int reviewId) {
		return repository.findById(reviewId);
	}
	
	public Optional<List<Review>> getReviewByBookId(int bookId) {
		return repository.findAllByBookId(bookId);
	}
	
	public Optional<List<Review>> getReviewbyUserId(int userId) {
		return repository.findAllByUserId(userId);
	}
}
