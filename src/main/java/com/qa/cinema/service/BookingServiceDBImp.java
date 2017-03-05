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
	
	@Inject
	private JSONUtil util;

	@Override
	public String getAllBookings() {
		Query query = em.createQuery("SELECT m FROM Booking m");
		@SuppressWarnings("unchecked")
		Collection<Booking> bookings = (Collection<Booking>) query.getResultList();
		return util.getJSONForObject(bookings);
	}

	@Override
	public String getBookingById(Long bookingId) {
		Query query = em.createQuery("SELECT f FROM Booking f WHERE bookingId =" + bookingId);
		Booking booking = (Booking) query.getSingleResult();
		return util.getJSONForObject(booking);
	}

	@Override
	public String addNewBooking(String bookingJson) {
		Booking newBooking = util.getObjectForJSON(bookingJson, Booking.class);
		em.persist(newBooking);
		return  "{\"message\": \"booking sucessfully added\"}" + bookingJson;
	}

	@Override
	public String removeBooking(Long bookingId) {
		Booking booking = findBooking(bookingId);
		if (booking != null) {
			em.remove(booking);
		}
		return "{\"message\": \"booking sucessfully removed\"}";

	}

	@Override
	public String updateBooking(Long bookingId, String bookingUpdate) {
		Booking updateBooking = util.getObjectForJSON(bookingUpdate, Booking.class);
		Booking booking = findBooking(bookingId);
		if (booking != null) {
			booking = updateBooking;
			em.merge(booking);
		}
		return "{\"message\": \"booking sucessfully updated\"}";
	}
	
	private Booking findBooking(Long id) {
		return em.find(Booking.class, id);
	}
}
