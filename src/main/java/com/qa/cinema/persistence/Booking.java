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

	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinColumn(name="ticket_booking_id")
	private List<Ticket> tickets;

	public Booking() {
	}

	public Booking(boolean complete, String paypal, List<Ticket> tickets) {
		super();
		this.complete = complete;
		this.paypal = paypal;
		this.tickets = tickets;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public String getPaypal() {
		return paypal;
	}

	public void setPaypal(String paypal) {
		this.paypal = paypal;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	
}