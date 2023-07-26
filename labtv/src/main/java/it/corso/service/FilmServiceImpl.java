package it.corso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.corso.dao.FilmDao;
import it.corso.model.Film;

@Service
public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmDao filmDao;
	
	
	@Override
	public List<Film> getAll() {
		
		List<Film> films = (List<Film>) filmDao.findAll();
		
		return films;
	}

	@Override
	public List<Film> getFilmByTitle(String title) {
		
		List<Film> films = (List<Film>) filmDao.findByTitle(title);
		return films;
	}

	@Override
	public Film getFilmById(String id) {
		
		return filmDao.findById(id).get();
	}

	@Override
	public List<Film> searchFilms(String query) {
		
		List<Film> films = filmDao.findByText(query);
		return films;
	}

}
