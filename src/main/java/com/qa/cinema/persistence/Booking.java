package com.qa.cinema.persistence;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.util.List;


/**
 * The persistent class for the cin_booking database table.
 * 
 */
@Entity
@Table(name="cin_booking")
@NamedQuery(name="Booking.findAll", query="SELECT b FROM Booking b")
public class Booking implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotNull
	@Column(name = "booking_id")
	private Long bookingId;

	@Column(name="booking_complete")
	private boolean complete;
	
	@Column(name = "booking_paypal")
	private String paypal;


	//bi-directional many-to-one association to Ticket
	@JoinColumn(name="ticket_id")
	@OneToMany
	private List<Ticket> tickets;

	public Booking() {
	}
	
	public Booking(Long bookingId, boolean complete, List<Ticket> tickets, String paypal) {
		
	}

	public boolean getComplete() {
		return this.complete;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public String getPaypal() {
		return paypal;
	}

	public void setPaypal(String paypal) {
		this.paypal = paypal;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

//	public List<Ticket> getTickets() {
//		return this.tickets;
//	}
//
//	public void setTickets(List<Ticket> tickets) {
//		this.tickets = tickets;
//	}

//	public Ticket addTicket(Ticket ticket) {
//		getTickets().add(ticket);
//		ticket.setBooking(this);
//
//		return ticket;
//	}
//
//	public Ticket removeTicket(Ticket ticket) {
//		getTickets().remove(ticket);
//		ticket.setBooking(null);
//
//		return ticket;
//	}

	@Override
	public String toString(){
		return null;
	}
}