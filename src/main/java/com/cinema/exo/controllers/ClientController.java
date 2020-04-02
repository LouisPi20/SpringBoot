package com.cinema.exo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.exo.services.ClientService;

@CrossOrigin
@RestController
@RequestMapping("clients")
public class ClientController {
	@Autowired 
	private ClientService service;
	@GetMapping("")
	public String findNom() {
		return this.service.findNom();
	}

}
