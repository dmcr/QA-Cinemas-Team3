package com.qa.cinema.persistence;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="cin_ticket")
@NamedQuery(name="Ticket.findAll", query="SELECT f FROM Ticket f")
public class Ticket implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ticket_id")
	private Long ticketId;
	
//	@NotNull
//	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
//	@JoinColumn(name = "ticket_booking_id", referencedColumnName = "booking_id")
//	private Booking booking;
	@Column(name="ticket_booking_id")
	private Long bookingId;

//	@NotNull
//	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
//	@JoinColumn(name = "ticket_showing_id", referencedColumnName = "showing_id")
//	private Showing showing;
	@OneToOne
	@JoinColumn(name="ticket_showing_id")
	private Showing showing;
	
//	@NotNull
//	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
//	@JoinColumn(name = "ticket_seat_id", referencedColumnName = "seat_id")
//	private Seat seat;
	@OneToOne
	@JoinColumn(name="ticket_seat_id")
	private Seat seat;

	public Ticket() {
		
	}
	
	

	public Ticket(Long ticketId, Long bookingId, Showing showing, Seat seat) {
		super();
		this.ticketId = ticketId;
		this.bookingId = bookingId;
		this.showing = showing;
		this.seat = seat;
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
	
}
