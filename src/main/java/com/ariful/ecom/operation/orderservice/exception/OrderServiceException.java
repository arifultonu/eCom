package com.ariful.ecom.operation.orderservice.exception;

import org.springframework.http.HttpStatus;

public class OrderServiceException extends RuntimeException{
    private HttpStatus status;
    private String message;

    public OrderServiceException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
