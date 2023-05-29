package com.ty.review_service.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ty.review_service.dao.ReviewDao;
import com.ty.review_service.dto.ReviewRequest;
import com.ty.review_service.entity.Review;
import com.ty.review_service.proxies.BookProxy;
import com.ty.review_service.proxies.UserProxy;

@Service
public class ReviewService {

	@Autowired
	private ReviewDao dao;
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private BookProxy bookProxy;
	@Autowired
	private UserProxy userProxy;
	
	public ResponseEntity<Review> saveReview(ReviewRequest reviewRequest,
			int userId, int bookId){
		Review review = this.modelMapper.map(reviewRequest, Review.class);
		bookProxy.checkForPresence(bookId);
		userProxy.checkForPresence(userId);
				review.setUserId(userId);
				review.setBookId(bookId);
				review = dao.saveReview(review);
				return new ResponseEntity<Review>(
						review, HttpStatus.CREATED);
	}  
}
