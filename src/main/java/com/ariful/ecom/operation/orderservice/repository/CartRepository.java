package com.ariful.ecom.operation.orderservice.repository;

import com.ariful.ecom.operation.orderservice.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartRepository extends JpaRepository<Cart, Long> {

}
