package com.ariful.ecom.operation.product_service.service;

import com.ariful.ecom.operation.product_service.payload.FeedbackDto;
import com.ariful.ecom.operation.product_service.payload.ProductDto;

import java.util.List;

public interface FeedbackService {

    FeedbackDto createFeedback(long productId,FeedbackDto feedbackDto);

    List<FeedbackDto> getAllFeedbackByProductId (long productId);

    FeedbackDto getFeedbackById(long productId, long feedbackId);

    FeedbackDto updateFeedbackById(long productId,long feedbackId,FeedbackDto feedbackDto);

    void deleteFeedbackById(long productId,long feedbackId);
}
