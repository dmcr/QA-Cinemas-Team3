package com.qa.cinema.service;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qa.cinema.persistence.Seat;
import com.qa.cinema.util.JSONUtil;


@Stateless
@Default
public class SeatServiceDBImp implements SeatService {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	@Inject
	private JSONUtil util;
	
	@Override
	public String getAllSeats() {
		Query query = em.createQuery("SELECT s FROM Seat s");
		Collection<Seat> seats = (Collection<Seat>)query.getResultList();
		return util.getJSONForObject(seats);
	}

	@Override
	public String getSeatById(Long seatId) {
		Query query = em.createQuery("SELECT s FROM Seat s WHERE seatId =" + seatId);
		Seat seat = (Seat)query.getSingleResult();
		return util.getJSONForObject(seat);
	}
	

}
