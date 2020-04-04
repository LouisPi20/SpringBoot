package com.cinema.exo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cinema.exo.models.Cinema;

public interface CinemaRepository extends MongoRepository<Cinema, String>{
	
}
