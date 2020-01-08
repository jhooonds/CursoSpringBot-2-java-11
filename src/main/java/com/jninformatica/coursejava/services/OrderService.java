package com.jninformatica.coursejava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jninformatica.coursejava.entities.Order;
import com.jninformatica.coursejava.repositories.OrderRepository;

@Service
public class OrderService {

	//Declarando dependencia para o repositorio, assim colocando
	// @AutoWired para que o spring coloque a depéncia do Repository
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
