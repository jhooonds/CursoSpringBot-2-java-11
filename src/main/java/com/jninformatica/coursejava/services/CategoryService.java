package com.jninformatica.coursejava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jninformatica.coursejava.entities.Category;
import com.jninformatica.coursejava.repositories.CategoryRepository;

@Service
public class CategoryService {

	//Declarando dependencia para o repositorio, assim colocando
	// @AutoWired para que o spring coloque a depéncia do Repository
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
