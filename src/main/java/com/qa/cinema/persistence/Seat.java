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
	@Column(name="seat_id")
	private Long seatId;

	@Column(name="seat_number")
	private int number;

	@Column(name="seat_row")
	private String row;

	//bi-directional many-to-one association to SeatType
	@ManyToOne(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
	@JoinColumn(name="seat_type_id")
	private SeatType seatType;

	//bi-directional many-to-one association to Screen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="seat_screen_id")
	private Screen screen;

	//bi-directional many-to-one association to Ticket
	@OneToMany(mappedBy="seat")
	private List<Ticket> tickets;

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

	public SeatType getSeatType() {
		return this.seatType;
	}

	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}

	public Screen getScreen() {
		return this.screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public List<Ticket> getTickets() {
		return this.tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public Ticket addTicket(Ticket ticket) {
		getTickets().add(ticket);
		ticket.setSeat(this);

		return ticket;
	}

	public Ticket removeTicket(Ticket ticket) {
		getTickets().remove(ticket);
		ticket.setSeat(null);

		return ticket;
	}

}