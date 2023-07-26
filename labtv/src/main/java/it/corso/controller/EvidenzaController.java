package it.corso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.corso.model.Evidenza;
import it.corso.service.EvidenzaService;

@RestController
@RequestMapping("labtv-api/api")
public class EvidenzaController {

	@Autowired
	private EvidenzaService evidenzaService;
	
	
	//#. Lista Film Evidenza 
	@GetMapping("evidenza")
	public List<Evidenza> getAll(){
		
		return evidenzaService.getAll();
	}
}
