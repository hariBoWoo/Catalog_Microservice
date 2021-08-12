package com.example.orderservice.jpa;

public interface OrderRepository {
    OrderEntity findByOrderId(String orderId);
    Iterable<OrderEntity> findByUserId(String userId);
}
