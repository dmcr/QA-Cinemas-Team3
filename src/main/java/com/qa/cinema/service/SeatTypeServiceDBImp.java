package com.qa.cinema.service;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qa.cinema.persistence.Seat;
import com.qa.cinema.persistence.SeatType;
import com.qa.cinema.util.JSONUtil;

@Stateless
@Default
public class SeatTypeServiceDBImp implements SeatTypeService{

	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	@Inject
	private JSONUtil util;

	@Override
	public String listAllSeatTypes() {
		Query query = em.createQuery("SELECT m FROM SeatType m");
		Collection<SeatType> SeatTypes = (Collection<SeatType>) query.getResultList();
		return util.getJSONForObject(SeatTypes);
	}

	@Override
	public String listSeatTypeBasedOnId(Long TypeId) {
		Query query = em.createQuery("SELECT s FROM SeatType s WHERE typeId ="+TypeId);
		SeatType seatType = (SeatType)query.getSingleResult();
		return util.getJSONForObject(seatType);
	}

}
