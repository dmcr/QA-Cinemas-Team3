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
	@Column(name="screen_id", unique=true, nullable=false)
	private Long screenId;

	@Column(name="cin_screen_capacity", nullable=false)
	private int screenCapacity;

	@Column(name="screen_type_id", nullable=false)
	private Long typeId;

	//bi-directional many-to-one association to Seat
	@OneToMany(mappedBy="cinScreen")
	private List<Seat> cinSeats;

	//bi-directional many-to-one association to Showing
	@OneToMany(mappedBy="cinScreen")
	private List<Showing> cinShowings;

	public Screen() {
	}

	public Long getScreenId() {
		return this.screenId;
	}

	public void setScreenId(Long screenId) {
		this.screenId = screenId;
	}

	public int getScreenCapacity() {
		return this.screenCapacity;
	}

	public void setScreenCapacity(int screenCapacity) {
		this.screenCapacity = screenCapacity;
	}

	public Long getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public List<Seat> getCinSeats() {
		return this.cinSeats;
	}

	public void setCinSeats(List<Seat> cinSeats) {
		this.cinSeats = cinSeats;
	}

	public Seat addCinSeat(Seat cinSeat) {
		getCinSeats().add(cinSeat);
		cinSeat.setCinScreen(this);

		return cinSeat;
	}

	public Seat removeCinSeat(Seat cinSeat) {
		getCinSeats().remove(cinSeat);
		cinSeat.setCinScreen(null);

		return cinSeat;
	}

	public List<Showing> getCinShowings() {
		return this.cinShowings;
	}

	public void setCinShowings(List<Showing> cinShowings) {
		this.cinShowings = cinShowings;
	}

	public Showing addCinShowing(Showing cinShowing) {
		getCinShowings().add(cinShowing);
		cinShowing.setCinScreen(this);

		return cinShowing;
	}

	public Showing removeCinShowing(Showing cinShowing) {
		getCinShowings().remove(cinShowing);
		cinShowing.setCinScreen(null);

		return cinShowing;
	}

}