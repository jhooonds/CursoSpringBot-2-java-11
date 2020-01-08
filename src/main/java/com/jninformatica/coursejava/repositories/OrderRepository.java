package com.jninformatica.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jninformatica.coursejava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
