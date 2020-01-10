package com.jninformatica.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jninformatica.coursejava.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
