package it.corso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.corso.model.Film;
import it.corso.service.FilmService;

@RestController
@RequestMapping("labtv-api/api")
public class FilmController {

	@Autowired
	private FilmService filmService;
	
	
	
	
	@GetMapping("/films")
	public List<Film> getAllFilms(){
		
		return filmService.getAll();
	}
	
	
	
	//#2. Ricerca Film Digitato
	@GetMapping("/films/titoli/{title}")
	public List<Film> getFilmByTitle(@PathVariable("title") String title){
		
		return filmService.getFilmByTitle(title);
	}
	
	
	
	//#3. Ricerca Film x Id 
	@GetMapping("/films/{id}")
	public Film getFilmById(@PathVariable("id") String id) {
		
		return filmService.getFilmById(id);
	}
	
	
	
	//#4. Ricerca Film x Testo Digitato l
	@GetMapping("/search")
	public List<Film> searchFilms(@RequestParam("query") String query){
		
		return filmService.searchFilms(query); 
	}
	
}
