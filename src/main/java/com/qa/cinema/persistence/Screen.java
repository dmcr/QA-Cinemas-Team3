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

	@Column(name="screen_type_id")
	private Long screenTypeId;

	//bi-directional many-to-one association to Seat
	@OneToMany(mappedBy="screen")
	private List<Seat> seats;

	//bi-directional many-to-one association to Showing
	@OneToMany(mappedBy="screen")
	private List<Showing> showings;

	public Screen() {
	}

	public Screen(Long screenId, int cinScreenCapacity, Long screenTypeId,
			List<Seat> seats, List<Showing> showings) {
		super();
		this.screenId = screenId;
		this.cinScreenCapacity = cinScreenCapacity;
		this.screenTypeId = screenTypeId;
		this.seats = seats;
		this.showings = showings;
	}

	public Long getScreenId() {
		return this.screenId;
	}

	public void setScreenId(Long screenId) {
		this.screenId = screenId;
	}

	public int getCinScreenCapacity() {
		return this.cinScreenCapacity;
	}

	public void setCinScreenCapacity(int cinScreenCapacity) {
		this.cinScreenCapacity = cinScreenCapacity;
	}

	public Long getScreenTypeId() {
		return this.screenTypeId;
	}

	public void setScreenTypeId(Long screenTypeId) {
		this.screenTypeId = screenTypeId;
	}

	public List<Seat> getSeats() {
		return this.seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	public Seat addSeat(Seat seat) {
		getSeats().add(seat);
		seat.setScreen(this);

		return seat;
	}

	public Seat removeSeat(Seat seat) {
		getSeats().remove(seat);
		seat.setScreen(null);

		return seat;
	}

	public List<Showing> getShowings() {
		return this.showings;
	}

	public void setShowings(List<Showing> showings) {
		this.showings = showings;
	}

	public Showing addShowing(Showing showing) {
		getShowings().add(showing);
		showing.setScreen(this);

		return showing;
	}

	public Showing removeShowing(Showing showing) {
		getShowings().remove(showing);
		showing.setScreen(null);

		return showing;
	}

}