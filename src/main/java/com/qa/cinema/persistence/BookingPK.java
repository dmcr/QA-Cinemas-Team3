package com.qa.cinema.persistence;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the cin_booking database table.
 * 
 */
@Embeddable
public class BookingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="booking_id", unique=true, nullable=false)
	private int bookingId;

	@Column(name="booking_paypal", unique=true, nullable=false)
	private int paypalId;

	public BookingPK() {
	}
	public int getBookingId() {
		return this.bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getPaypalId() {
		return this.paypalId;
	}
	public void setPaypalId(int paypalId) {
		this.paypalId = paypalId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BookingPK)) {
			return false;
		}
		BookingPK castOther = (BookingPK)other;
		return 
			(this.bookingId == castOther.bookingId)
			&& (this.paypalId == castOther.paypalId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.bookingId;
		hash = hash * prime + this.paypalId;
		
		return hash;
	}
}