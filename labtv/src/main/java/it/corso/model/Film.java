package it.corso.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "film")
public class Film {

	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "plot")
	private String plot;
	
	@ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	@JoinTable
	(
		name = "film_director",
		joinColumns = @JoinColumn(name = "idFilm", referencedColumnName = "id"),
		inverseJoinColumns = @JoinColumn(name = "idDirector", referencedColumnName = "id")
	)
	private List<Director> directors = new ArrayList<>();
	
	
	@ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	@JoinTable
	(
		name = "film_genre",
		joinColumns = @JoinColumn(name = "idFilm", referencedColumnName = "id"),
		inverseJoinColumns = @JoinColumn(name = "idGenre", referencedColumnName = "id")
	)
	private List<Genre> genres = new ArrayList<>();
	
	@ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	@JoinTable
	(
		name = "film_star",
		joinColumns = @JoinColumn(name = "idFilm", referencedColumnName = "id"),
		inverseJoinColumns = @JoinColumn(name = "idStar", referencedColumnName = "id")
	)
	private List<Star> stars = new ArrayList<>();
	
	
	@ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	@JoinTable
	(
		name = "film_similar",
		joinColumns = @JoinColumn(name = "idFilm", referencedColumnName = "id"),
		inverseJoinColumns = @JoinColumn(name = "idSimilar", referencedColumnName = "id")
	)
	private List<Similar> similars = new ArrayList<>();

	
	
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public List<Director> getDirectors() {
		return directors;
	}

	public void setDirectors(List<Director> directors) {
		this.directors = directors;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	public List<Star> getStars() {
		return stars;
	}

	public void setStars(List<Star> stars) {
		this.stars = stars;
	}

	public List<Similar> getSimilars() {
		return similars;
	}

	public void setSimilars(List<Similar> similars) {
		this.similars = similars;
	}
	
	
	
}
