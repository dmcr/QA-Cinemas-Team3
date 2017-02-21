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
	@Column(name="type_id", unique=true, nullable=false)
	private Long typeId;

	@Column(name="type_name", nullable=false, length=1)
	private String name;

	@Column(name="type_price", nullable=false, precision=10)
	private BigDecimal price;

	//bi-directional many-to-one association to Seat
	@OneToMany(mappedBy="cinSeatType")
	private List<Seat> cinSeats;

	public SeatType() {
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

	public List<Seat> getCinSeats() {
		return this.cinSeats;
	}

	public void setCinSeats(List<Seat> cinSeats) {
		this.cinSeats = cinSeats;
	}

	public Seat addCinSeat(Seat cinSeat) {
		getCinSeats().add(cinSeat);
		cinSeat.setCinSeatType(this);

		return cinSeat;
	}

	public Seat removeCinSeat(Seat cinSeat) {
		getCinSeats().remove(cinSeat);
		cinSeat.setCinSeatType(null);

		return cinSeat;
	}

}