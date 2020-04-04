package com.cinema.exo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.exo.models.Seance;
import com.cinema.exo.repositories.SeanceRepository;


@Service
public class SeanceService {
	
	@Autowired
	private SeanceRepository repository;

	public List<Seance> findAll() {
		return this.repository.findAll();
	}

	public Seance saveSeances(Seance seanceSave) {
		return this.repository.save(seanceSave);
	}
	
	public Seance modifierSeances(Seance seanceModif) {
		return this.repository.save(seanceModif);
	}
	
	public void suppSeances(Seance seanceSupp) {
		this.repository.delete(seanceSupp);
	}
}
