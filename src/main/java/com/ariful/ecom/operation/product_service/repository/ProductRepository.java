package com.ariful.ecom.operation.product_service.repository;

import com.ariful.ecom.operation.product_service.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    @Query("from Product where product_category_id = :categoryId")
    List<Product> findByCategoryId (Long categoryId);

}
