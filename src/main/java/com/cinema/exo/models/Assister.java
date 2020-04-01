package com.cinema.exo.models;

import java.util.Set;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document

public class Assister {

	private float prix;
	
	@DBRef
	private Set<Client> clients;
	
}
