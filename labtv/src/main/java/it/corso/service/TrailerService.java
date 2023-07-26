package it.corso.service;

import java.util.List;

import it.corso.model.Trailer;

public interface TrailerService {

	List<Trailer> getTrailer(String idFilm);
}
