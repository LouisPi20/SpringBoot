package com.cinema.exo.models;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document

public class Seance {

	private LocalDateTime date;
	private List<Assister> clients;
	private Salle salle;
	private String type;
	
	@DBRef
	private Set<Film> films;
	
}
