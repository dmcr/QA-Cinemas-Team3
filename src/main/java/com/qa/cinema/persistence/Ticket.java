package com.qa.cinema.persistence;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cin_ticket")
@NamedQuery(name="Ticket.findAll", query="SELECT f FROM Ticket f")
public class Ticket implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ticket_id")
	private Long ticketId;
	
	@Column(name="ticket_booking_id")
	private Long bookingId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ticket_showing_id")
	private Showing showing;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ticket_seat_id")
	private Seat seat;
	
	@Column(name="ticket_type")
	@Enumerated(EnumType.STRING)
	private TicketType ticketType;

	public Ticket() {
		
	}
	
	public Ticket(Long ticketId, Long bookingId, Showing showing, Seat seat, TicketType ticketType) {
		super();
		this.ticketId = ticketId;
		this.bookingId = bookingId;
		this.showing = showing;
		this.seat = seat;
		this.ticketType = ticketType;
	}

	public Long getTicketId() {
		return ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public Showing getShowing() {
		return showing;
	}

	public void setShowing(Showing showing) {
		this.showing = showing;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public TicketType getTicketType() {
		return ticketType;
	}

	public void setTicketType(TicketType ticketType) {
		this.ticketType = ticketType;
	}
	
}
