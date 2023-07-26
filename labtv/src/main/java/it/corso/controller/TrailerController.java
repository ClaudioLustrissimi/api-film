package it.corso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.corso.model.Trailer;
import it.corso.service.TrailerService;

@RestController
@RequestMapping("labtv-api/api")
public class TrailerController {
	
	@Autowired
	private TrailerService trailerService;
	
	
	
	@GetMapping("/trailers/{idfilm}")
	public List<Trailer> getTrailerByIdFilm(@PathVariable("idfilm") String idfilm){
		
		return trailerService.getTrailer(idfilm);
	}

}
