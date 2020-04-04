package com.cinema.exo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.exo.models.Client;
import com.cinema.exo.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;

	public List<Client> findAll() {
		return this.repository.findAll();
	}

	public Client saveClients(Client clientSave) {
		return this.repository.save(clientSave);
	}

	public Client modifierClients(Client clientModif) {
		return this.repository.save(clientModif);
	}

	public void suppClients(Client clientSupp) {
		this.repository.delete(clientSupp);
		
	}
	

}
