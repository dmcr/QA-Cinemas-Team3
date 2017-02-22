package com.qa.cinema.persistence;


import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the cin_seat_type database table.
 * 
 */
@Entity
@Table(name="cin_seat_type")
@NamedQuery(name="SeatType.findAll", query="SELECT s FROM SeatType s")
public class SeatType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="type_id")
	private Long typeId;

	@Column(name="type_name")
	private String name;

	@Column(name="type_price")
	private BigDecimal price;

	//bi-directional many-to-one association to Seat
	@OneToMany(mappedBy="seatType", cascade={CascadeType.ALL})
	private List<Seat> seats;

	public SeatType() {
	}
	
	public SeatType(Long typeId, String name, BigDecimal price, List<Seat> seats) {
		this.typeId = typeId;
		this.name = name;
		this.price = price;
		this.seats = seats;
	}

	public Long getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public List<Seat> getSeats() {
		return this.seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	public Seat addSeat(Seat seat) {
		getSeats().add(seat);
		seat.setSeatType(this);

		return seat;
	}

	public Seat removeSeat(Seat seat) {
		getSeats().remove(seat);
		seat.setSeatType(null);

		return seat;
	}

}
