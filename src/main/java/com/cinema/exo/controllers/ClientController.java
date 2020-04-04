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

import com.cinema.exo.models.Client;
import com.cinema.exo.services.ClientService;

@CrossOrigin
@RestController
@RequestMapping("clients")
public class ClientController {
	
	@Autowired
	private ClientService service;
	
	@GetMapping("")
	public List<Client> findAll() {
		return this.service.findAll();
	}
	@PostMapping("")
	public Client saveClients(@RequestBody Client clientSave) {
		return this.service.saveClients(clientSave);
	}
	
	@PutMapping("")
	public Client modifierClients(@RequestBody Client clientModif) {
		return this.service.modifierClients(clientModif);
	}
	
	@DeleteMapping("")
	public void suppClients(@RequestBody Client clientSupp) {
		this.service.suppClients(clientSupp);
	}
}
