package com.ariful.ecom.operation.orderservice.service;

import com.ariful.ecom.operation.orderservice.dto.ShipmentDto;

import java.util.List;

public interface ShipmentService {
    List<ShipmentDto> getAllShipment();

    ShipmentDto save(ShipmentDto shipmentDto);

    ShipmentDto findShipmentById(long shipmentId);

    ShipmentDto updateShipmentById(long shipmentId, ShipmentDto shipmentDto);

    void deleteShipmentById(long shipmentId);
}
