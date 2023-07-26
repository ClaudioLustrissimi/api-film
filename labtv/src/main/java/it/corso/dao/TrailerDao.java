package it.corso.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.corso.model.Trailer;

public interface TrailerDao extends CrudRepository<Trailer, Integer>{

	
	List<Trailer> findByIdFilm(String idFilm);
}
