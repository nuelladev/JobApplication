package com.example.myjobapp.review;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ReviewService {
    List<Review> getAllReviews(Long companyId);

    Boolean addReview(Long companyId,Review review);

}
