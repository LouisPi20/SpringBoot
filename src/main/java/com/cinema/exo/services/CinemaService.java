package com.cinema.exo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.exo.models.Cinema;
import com.cinema.exo.repositories.CinemaRepository;
@Service
public class CinemaService {
	
	
	@Autowired
	private CinemaRepository repository;

	public List<Cinema> findAll() {
		return this.repository.findAll();
	}

	public Cinema saveCinemas(Cinema cinemaSave) {
		return this.repository.save(cinemaSave);
	}
	
	public Cinema modifierFilms(Cinema cinemaModif) {
		return this.repository.save(cinemaModif);
	}

	public void suppCinemas(Cinema cinemaSupp) {
		this.repository.delete(cinemaSupp);
	}

}
