package com.cinema.exo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cinema.exo.models.Film;

public interface FilmRepository extends MongoRepository<Film, String> { 
	
	
}