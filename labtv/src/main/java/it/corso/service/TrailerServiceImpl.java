package it.corso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.corso.dao.TrailerDao;
import it.corso.model.Trailer;

@Service
public class TrailerServiceImpl implements TrailerService {

	@Autowired
	private TrailerDao trailerDao;
	
	@Override
	public List<Trailer> getTrailer(String idFilm) {
		
		List<Trailer> result = (List<Trailer>) trailerDao.findByIdFilm(idFilm);
		
		return result;
	}

}
