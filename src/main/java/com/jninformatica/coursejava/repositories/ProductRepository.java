package com.jninformatica.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jninformatica.coursejava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
