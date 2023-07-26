package it.corso.service;

import java.util.List;

import it.corso.model.Film;

public interface FilmService {

	List<Film> getAll();
	List<Film> getFilmByTitle(String title);
	Film getFilmById(String id);
	List<Film> searchFilms(String query);
}
