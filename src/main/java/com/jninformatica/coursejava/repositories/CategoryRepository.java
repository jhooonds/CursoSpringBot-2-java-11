package com.jninformatica.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jninformatica.coursejava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
