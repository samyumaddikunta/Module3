package com.cg.orderservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.orderservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
