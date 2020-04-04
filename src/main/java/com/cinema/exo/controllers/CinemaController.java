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

import com.cinema.exo.models.Cinema;
import com.cinema.exo.services.CinemaService;

@CrossOrigin
@RestController
@RequestMapping("cinemas")
public class CinemaController {
	
	@Autowired
	private CinemaService service;
	
	
	@GetMapping("")
	public List<Cinema> findAll() {
		return this.service.findAll();
	}
	
	@PostMapping("")
	public Cinema saveCinemas(@RequestBody Cinema cinemaSave) {
		return this.service.saveCinemas(cinemaSave);
	}
	
	@PutMapping("")
	public Cinema modifierCinemas(@RequestBody Cinema cinemaModif) {
		return this.service.modifierFilms(cinemaModif);
	}
	
	@DeleteMapping("")
	public void suppCinemas(@RequestBody Cinema cinemaSupp) {
		this.service.suppCinemas(cinemaSupp);
	}

}
