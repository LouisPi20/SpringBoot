package com.cinema.exo.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cinema.exo.models.Film;

public interface FilmRepository extends MongoRepository<Film, String> { 
	public Optional<Film> findById(int id);
}