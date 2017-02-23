package com.qa.cinema.service;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.qa.cinema.util.JSONUtil;
import com.qa.cinema.persistence.*;

@Stateless
@Default
public class BookingServiceDBImp implements BookingService {
	@PersistenceContext(unitName = "bookingService")
	private EntityManager em;
	
	@Inject
	private JSONUtil util;
	
		@Override
	public String getAllBookings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getBookingByID(Long bookingID) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Booking findBooking(Long bookingID){
		return em.find(Booking.class, bookingID);
	}

}
