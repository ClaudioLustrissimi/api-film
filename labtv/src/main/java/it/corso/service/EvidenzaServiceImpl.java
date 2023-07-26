package it.corso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.corso.dao.EvidenzaDao;
import it.corso.model.Evidenza;

@Service
public class EvidenzaServiceImpl implements EvidenzaService {

	@Autowired
	private EvidenzaDao evidenzaDao;
	
	@Override
	public List<Evidenza> getAll() {
		
		return (List<Evidenza>) evidenzaDao.findAll();
	}

}
