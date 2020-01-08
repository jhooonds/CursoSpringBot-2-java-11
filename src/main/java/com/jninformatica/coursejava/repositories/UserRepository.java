package com.jninformatica.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jninformatica.coursejava.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
