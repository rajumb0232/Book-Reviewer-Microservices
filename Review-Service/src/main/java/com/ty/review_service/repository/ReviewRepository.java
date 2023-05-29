package com.ty.review_service.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.review_service.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer>{

	public Optional<List<Review>> findAllByBookId(int bookId);

	public Optional<List<Review>> findAllByUserId(int userId);

}
