package it.corso.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trailer")
public class Trailer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "idFilm")
	private String idFilm;
	
	@Column(name = "videoUrl")
	private String videourl;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdFilm() {
		return idFilm;
	}

	public void setIdFilm(String idfilm) {
		this.idFilm = idfilm;
	}

	public String getVideourl() {
		return videourl;
	}

	public void setVideourl(String videourl) {
		this.videourl = videourl;
	}

	
	
}
