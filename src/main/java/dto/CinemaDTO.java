package dto;

import org.springframework.data.mongodb.core.mapping.Document;

import com.cinema.exo.models.Cinema;
import com.cinema.exo.models.Salle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class CinemaDTO {

	private Cinema cinema;
	private Salle[] salle;
	
	
}


