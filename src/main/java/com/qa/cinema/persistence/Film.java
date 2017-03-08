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
	@Enumerated(EnumType.STRING)
	private CertificationRating certification;

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

	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinColumn(name="showing_film_id")
	private List<Showing> showings;
	
	@Column(name="film_IMDBID")
	private String IMDBID;
	
	@Column(name="film_poster_url")
	private String posterUrl;

	public Film() {
		
	}
	
	public Film(Long filmId, boolean is3d, String cast, CertificationRating certification, String director,
			int duration, String genre, Date releaseDate, String summary, String title, List<Showing> showings,
			String iMDBID, String posterUrl) {
		super();
		this.filmId = filmId;
		is3D = is3d;
		this.cast = cast;
		this.certification = certification;
		this.director = director;
		this.duration = duration;
		this.genre = genre;
		this.releaseDate = releaseDate;
		this.summary = summary;
		this.title = title;
		this.showings = showings;
		IMDBID = iMDBID;
		this.posterUrl = posterUrl;
	}

	public Long getFilmId() {
		return filmId;
	}

	public void setFilmId(Long filmId) {
		this.filmId = filmId;
	}

	public boolean isIs3D() {
		return is3D;
	}

	public void setIs3D(boolean is3d) {
		is3D = is3d;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public CertificationRating getCertification() {
		return certification;
	}

	public void setCertification(CertificationRating certification) {
		this.certification = certification;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Showing> getShowings() {
		return showings;
	}

	public void setShowings(List<Showing> showings) {
		this.showings = showings;
	}

	public String getIMDBID() {
		return IMDBID;
	}

	public void setIMDBID(String iMDBID) {
		IMDBID = iMDBID;
	}

	public String getPosterUrl() {
		return posterUrl;
	}

	public void setPosterUrl(String posterUrl) {
		this.posterUrl = posterUrl;
	}
	
	

}