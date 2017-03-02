package com.qa.cinema.persistence;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the cin_screen database table.
 * 
 */
@Entity
@Table(name="cin_screen")
@NamedQuery(name="Screen.findAll", query="SELECT s FROM Screen s")
public class Screen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="screen_id")
	private Long screenId;

	@Column(name="cin_screen_capacity")
	private int cinScreenCapacity;

	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinColumn(name = "seat_screen_id")
	private List<Seat> seats;

	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinColumn(name="showing_screen_id")
	private List<Showing> showings;
	

	public Screen() {
	}


	public Screen(Long screenId, int cinScreenCapacity, List<Seat> seats, List<Showing> showings) {
		super();
		this.screenId = screenId;
		this.cinScreenCapacity = cinScreenCapacity;
		this.seats = seats;
		this.showings = showings;
	}


	public Long getScreenId() {
		return screenId;
	}


	public void setScreenId(Long screenId) {
		this.screenId = screenId;
	}


	public int getCinScreenCapacity() {
		return cinScreenCapacity;
	}


	public void setCinScreenCapacity(int cinScreenCapacity) {
		this.cinScreenCapacity = cinScreenCapacity;
	}


	public List<Seat> getSeats() {
		return seats;
	}


	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}


	public List<Showing> getShowings() {
		return showings;
	}


	public void setShowings(List<Showing> showings) {
		this.showings = showings;
	}
	

}