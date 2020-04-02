package com.cinema.exo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.exo.models.Film;
import com.cinema.exo.services.FilmService;
@CrossOrigin
@RestController
@RequestMapping("films")
public class FilmController {
	
	@Autowired
	private FilmService service;
	
	@GetMapping("")
	public List<Film> findAll(){
		return this.service.findAll();
	}
	
	@PostMapping("")
	public Film saveFilms(@RequestBody Film filmSave) {
		return this.service.saveFilms(filmSave);
	}
	
	@PutMapping("")
	public Film modifierFilms(@RequestBody Film filmModif) {
		return this.service.modifierFilms(filmModif);
	}
	
	@DeleteMapping("")
	public void suppFilms(@RequestBody Film filmSupp) {
		this.service.suppFilms(filmSupp);
	}
}
