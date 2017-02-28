package com.qa.cinema.service;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qa.cinema.util.JSONUtil;
import com.qa.cinema.persistence.*;

@Stateless
@Default
public class BookingServiceDBImp implements BookingService {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	@SuppressWarnings("unused")
	@Inject
	private JSONUtil util;

	@Override
	public String getAllBookings() {
		Query query = em.createQuery("SELECT b FROM Booking b");
		Collection<Booking> bookings = (Collection<Booking> )query.getResultList();
		return util.getJSONForObject(bookings);
	}

	@Override
	public String getBookingByID(Long bookingId) {
		Query query = em.createQuery("SELECT b FROM Booking b WHERE bookingId ="+bookingId);
		Booking booking = (Booking)query.getSingleResult();
		return util.getJSONForObject(booking);
	}
	

}
