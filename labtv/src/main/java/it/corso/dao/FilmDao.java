package it.corso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import it.corso.model.Film;

public interface FilmDao extends CrudRepository<Film, String>{

	List<Film> findByTitle(String title);
	
	
	@Query("SELECT f FROM Film f WHERE " + 
			"f.title LIKE CONCAT('%',:query, '%')"
			)
	List<Film> findByText(String query);
	
}
