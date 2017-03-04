package com.qa.cinema.service;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qa.cinema.persistence.Seat;
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
		Query query = em.createQuery("SELECT m FROM Seat m");
		@SuppressWarnings("unchecked")
		Collection<Seat> seats = (Collection<Seat>) query.getResultList();
		return util.getJSONForObject(seats);
	}

	@Override
	public String getSeatById(Long seatId) {
		Query query = em.createQuery("SELECT f FROM Seat f WHERE seatId =" + seatId);
		Seat seat = (Seat) query.getSingleResult();
		return util.getJSONForObject(seat);
	}

	@Override
	public String addNewSeat(String seatJson) {
		Seat newSeat = util.getObjectForJSON(seatJson, Seat.class);
		em.persist(newSeat);
		return  "{\"message\": \"seat sucessfully added\"}" + seatJson;
	}

	@Override
	public String removeSeat(Long seatId) {
		Seat seat = findSeat(new Long(seatId));
		if (seat != null) {
			em.remove(seat);
		}
		return "{\"message\": \"seat sucessfully removed\"}";

	}

	@Override
	public String updateSeat(Long seatId, String seatUpdate) {
		Seat updateSeat = util.getObjectForJSON(seatUpdate, Seat.class);
		Seat seat = findSeat(new Long(seatId));
		if (seat != null) {
			seat = updateSeat;
			em.merge(seat);
		}
		return "{\"message\": \"seat sucessfully updated\"}";
	}
	
	private Seat findSeat(Long id) {
		return em.find(Seat.class, id);
	}

}
