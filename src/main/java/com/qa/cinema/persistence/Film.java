package com.qa.cinema.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cin_film database table.
 * 
 */
@Entity
@Table(name="cin_film")
@NamedQuery(name="Film.findAll", query="SELECT f FROM Film f")
public class Film implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="film_id")
	private Long filmId;

	@Column(name="film_3D")
	private boolean is3D;

	@Column(name="film_cast")
	private String cast;

	@Column(name="film_certification")
	private String certification;

	@Column(name="film_director")
	private String director;

	@Column(name="film_duration")
	private int duration;

	@Column(name="film_genre")
	private String genre;

	@Temporal(TemporalType.DATE)
	@Column(name="film_release_date")
	private Date releaseDate;

	@Column(name="film_summary")
	private String summary;

	@Column(name="film_title")
	private String title;

	//bi-directional many-to-one association to Showing
	@OneToMany(mappedBy="film")
	private List<Showing> showings;

	public Film() {
	}

	public Long getFilmId() {
		return this.filmId;
	}

	public void setFilmId(Long filmId) {
		this.filmId = filmId;
	}

	public boolean getIs3D() {
		return this.is3D;
	}

	public void setIs3D(boolean is3D) {
		this.is3D = is3D;
	}

	public String getCast() {
		return this.cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getCertification() {
		return this.certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getDirector() {
		return this.director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Date getReleaseDate() {
		return this.releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Showing> getShowings() {
		return this.showings;
	}

	public void setShowings(List<Showing> showings) {
		this.showings = showings;
	}

	public Showing addShowing(Showing showing) {
		getShowings().add(showing);
		showing.setFilm(this);

		return showing;
	}

	public Showing removeShowing(Showing showing) {
		getShowings().remove(showing);
		showing.setFilm(null);

		return showing;
	}

}