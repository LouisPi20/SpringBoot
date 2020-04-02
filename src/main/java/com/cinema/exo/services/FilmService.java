package com.cinema.exo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.exo.models.Film;
import com.cinema.exo.repositories.FilmRepository;
@Service
public class FilmService {

	@Autowired private FilmRepository repository;
	
	public List<Film> findAll(){
		return this.repository.findAll();
	}
	
	public Film saveFilms(Film filmSave) {
		return this.repository.save(filmSave);
	}

	public Film modifierFilms(Film filmModif) {
		return this.repository.save(filmModif);
	}
	
	public void suppFilms(Film filmSupp) {
		this.repository.delete(filmSupp);
	}
	
}
