package com.cinema.exo.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cinema.exo.models.Assister;

public interface AssisterRepository extends MongoRepository<Assister, String> {
	public Optional<Assister> findById(String id);
	
}
