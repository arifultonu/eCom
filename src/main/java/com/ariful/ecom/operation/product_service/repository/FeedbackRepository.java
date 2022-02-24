package com.ariful.ecom.operation.product_service.repository;

import com.ariful.ecom.operation.product_service.entity.Feedback;
import com.ariful.ecom.operation.product_service.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback,Long> {

    @Query("from Feedback where feedback_product_id = :productId")
    List<Feedback> findByproductId (long productId);
}
