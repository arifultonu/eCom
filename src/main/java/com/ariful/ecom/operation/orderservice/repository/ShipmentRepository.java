package com.ariful.ecom.operation.orderservice.repository;

import com.ariful.ecom.operation.orderservice.entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
}
