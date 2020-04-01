package com.cinema.exo.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cinema.exo.models.Salle;

public interface SalleRepository extends MongoRepository<Salle, String> {
	public Optional<Salle> findByNom(String noms);
	
}
