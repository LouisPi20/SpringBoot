package com.cinema.exo.repositories;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.cinema.exo.models.Seance;

public interface SeanceRepository extends MongoRepository<Seance, String > {
	public List<Seance> findAllByDate(LocalDateTime time);
	

}
