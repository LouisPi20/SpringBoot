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

import com.cinema.exo.models.Seance;
import com.cinema.exo.services.SeanceService;

@CrossOrigin
@RestController
@RequestMapping("seances")
public class SeanceController {
	
	@Autowired
	private SeanceService service;
	
	@GetMapping("")
	public List<Seance> findAll() {
		return this.service.findAll();	
	}
	
	@PostMapping("")
	public Seance saveSeances(@RequestBody Seance seanceSave) {
		return this.service.saveSeances(seanceSave);
	}
	
	@PutMapping("")
	public Seance modifierSeances(@RequestBody Seance seanceModif) {
		return this.service.modifierSeances(seanceModif);
	}
	
	@DeleteMapping("")
	public void suppSeances(@RequestBody Seance seanceSupp) {
		this.service.suppSeances(seanceSupp);
	}
	
}

