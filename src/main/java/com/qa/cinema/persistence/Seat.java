package com.qa.cinema.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cin_seat database table.
 * 
 */
@Entity
@Table(name="cin_seat")
@NamedQuery(name="Seat.findAll", query="SELECT s FROM Seat s")
public class Seat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="seat_id", unique=true, nullable=false)
	private Long seatId;

	@Column(name="seat_number", nullable=false)
	private int number;

	@Column(name="seat_row", nullable=false, length=2)
	private String row;

	//bi-directional many-to-one association to SeatType
	@ManyToOne(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
	@JoinColumn(name="seat_type_id", nullable=false)
	private SeatType cinSeatType;

	//bi-directional many-to-one association to Screen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="seat_screen_id", nullable=false)
	private Screen cinScreen;

	//bi-directional many-to-one association to Ticket
	@OneToMany(mappedBy="cinSeat")
	private List<Ticket> cinTickets;

	public Seat() {
	}

	public Long getSeatId() {
		return this.seatId;
	}

	public void setSeatId(Long seatId) {
		this.seatId = seatId;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getRow() {
		return this.row;
	}

	public void setRow(String row) {
		this.row = row;
	}

	public SeatType getCinSeatType() {
		return this.cinSeatType;
	}

	public void setCinSeatType(SeatType cinSeatType) {
		this.cinSeatType = cinSeatType;
	}

	public Screen getCinScreen() {
		return this.cinScreen;
	}

	public void setCinScreen(Screen cinScreen) {
		this.cinScreen = cinScreen;
	}

	public List<Ticket> getCinTickets() {
		return this.cinTickets;
	}

	public void setCinTickets(List<Ticket> cinTickets) {
		this.cinTickets = cinTickets;
	}

	public Ticket addCinTicket(Ticket cinTicket) {
		getCinTickets().add(cinTicket);
		cinTicket.setCinSeat(this);

		return cinTicket;
	}

	public Ticket removeCinTicket(Ticket cinTicket) {
		getCinTickets().remove(cinTicket);
		cinTicket.setCinSeat(null);

		return cinTicket;
	}

}