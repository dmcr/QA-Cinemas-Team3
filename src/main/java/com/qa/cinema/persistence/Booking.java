package com.qa.cinema.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cin_booking database table.
 * 
 */
@Entity
@Table(name="cin_booking")
@NamedQuery(name="Booking.findAll", query="SELECT b FROM Booking b")
public class Booking implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BookingPK id;

	@Column(name="booking_complete", nullable=false)
	private boolean complete;

	//bi-directional many-to-one association to Ticket
	@OneToMany(mappedBy="cinBooking")
	private List<Ticket> cinTickets;

	public Booking() {
	}

	public BookingPK getId() {
		return this.id;
	}

	public void setId(BookingPK id) {
		this.id = id;
	}

	public boolean getComplete() {
		return this.complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public List<Ticket> getCinTickets() {
		return this.cinTickets;
	}

	public void setCinTickets(List<Ticket> cinTickets) {
		this.cinTickets = cinTickets;
	}

	public Ticket addCinTicket(Ticket cinTicket) {
		getCinTickets().add(cinTicket);
		cinTicket.setCinBooking(this);

		return cinTicket;
	}

	public Ticket removeCinTicket(Ticket cinTicket) {
		getCinTickets().remove(cinTicket);
		cinTicket.setCinBooking(null);

		return cinTicket;
	}

}