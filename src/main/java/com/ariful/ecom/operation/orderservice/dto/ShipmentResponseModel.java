package com.ariful.ecom.operation.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShipmentResponseModel {
    private String outCode ="";
    private String outMessage = "";
}
