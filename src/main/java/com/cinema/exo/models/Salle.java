package com.cinema.exo.models;

import java.util.Set;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document

public class Salle {

	private String nom;
	private int place;
	
	
	@DBRef
	private Set<Cinema> cinemas;
}
