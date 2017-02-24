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
	
	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	@SuppressWarnings("unused")
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
	

}
