package com.ariful.ecom.operation.orderservice.service;

import com.ariful.ecom.operation.orderservice.dto.CartDto;

import java.util.List;

public interface CartService {
    List<CartDto> getAllCart();

    CartDto save(CartDto cartDto);

    CartDto findCartById(long cartId);

    CartDto updateCartById(long cartId, CartDto cartDto);

    void deleteCartById(long cartId);
}
