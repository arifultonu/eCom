package com.ariful.ecom.operation.orderservice.repository;

import com.ariful.ecom.operation.orderservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    @Query("From Order")
    public List<Order> getAllOrders();
}
