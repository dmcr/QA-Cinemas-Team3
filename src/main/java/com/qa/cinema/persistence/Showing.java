package com.qa.cinema.persistence;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the cin_showing database table.
 * 
 */
@Entity
@Table(name="cin_showing")
@NamedQuery(name="Showing.findAll", query="SELECT s FROM Showing s")
public class Showing implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="showing_id")
	private Long showingId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="showing_start_time")
	private Date startTime;

	@Column(name="showing_screen_id")
	private Long screenId;

	@Column(name="showing_film_id")
	private Long filmId;

	public Showing() {
	}

	public Showing(Long showingId, Date startTime, Long screenId, Long filmId) {
		super();
		this.showingId = showingId;
		this.startTime = startTime;
		this.screenId = screenId;
		this.filmId = filmId;
	}

	public Long getShowingId() {
		return showingId;
	}

	public void setShowingId(Long showingId) {
		this.showingId = showingId;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Long getScreenId() {
		return screenId;
	}

	public void setScreenId(Long screenId) {
		this.screenId = screenId;
	}

	public Long getFilmId() {
		return filmId;
	}

	public void setFilmId(Long filmId) {
		this.filmId = filmId;
	}

}