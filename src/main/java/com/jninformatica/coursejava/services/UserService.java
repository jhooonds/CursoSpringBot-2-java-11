package com.jninformatica.coursejava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jninformatica.coursejava.entities.User;
import com.jninformatica.coursejava.repositories.UserRepository;

@Service
public class UserService {

	//Declarando dependencia para o repositorio, assim colocando
	// @AutoWired para que o spring coloque a depéncia do Repository
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
}
