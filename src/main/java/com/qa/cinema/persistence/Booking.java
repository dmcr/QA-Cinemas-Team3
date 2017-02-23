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
	@NotNull
	@Column(name = "booking_id")
	private Long bookingId;

	@Column(name="booking_complete")
	private boolean complete;
	
	@Column(name="booking_paypal")
	private long paypalId;

	//bi-directional many-to-one association to Ticket
	@OneToMany(mappedBy="booking")
	private List<Ticket> tickets;

	public Booking() {
	}

	public Long getId() {
		return this.bookingId;
	}

	public void setId(Long id) {
		this.bookingId = id;
	}

	public boolean getComplete() {
		return this.complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	
	public Long getPaypalBookingID(){
		return this.paypalId;
	}
	
	public void setPaypalBookingID(long paypalID){
		this.paypalId = paypalID;
	}

	public List<Ticket> getTickets() {
		return this.tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public Ticket addTicket(Ticket ticket) {
		getTickets().add(ticket);
		ticket.setBooking(this);

		return ticket;
	}

	public Ticket removeTicket(Ticket ticket) {
		getTickets().remove(ticket);
		ticket.setBooking(null);

		return ticket;
	}

}