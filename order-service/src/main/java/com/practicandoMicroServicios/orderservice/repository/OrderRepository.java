package com.practicandoMicroServicios.orderservice.repository;

import com.practicandoMicroServicios.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}