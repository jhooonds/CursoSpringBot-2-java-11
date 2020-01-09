package com.jninformatica.coursejava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jninformatica.coursejava.entities.Product;
import com.jninformatica.coursejava.repositories.ProductRepository;

@Service
public class ProductService {

	//Declarando dependencia para o repositorio, assim colocando
	// @AutoWired para que o spring coloque a depéncia do Repository
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
