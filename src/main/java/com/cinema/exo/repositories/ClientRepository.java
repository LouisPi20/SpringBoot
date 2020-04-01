package com.cinema.exo.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cinema.exo.models.Client;

public interface ClientRepository extends MongoRepository<Client, String> {
	public Optional<Client> findById(int id);
	

}
