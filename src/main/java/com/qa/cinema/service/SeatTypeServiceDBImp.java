package com.qa.cinema.service;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
	public String getAllSeatTypes() {
		Query query = em.createQuery("SELECT m FROM SeatType m");
		@SuppressWarnings("unchecked")
		Collection<SeatType> seatTypes = (Collection<SeatType>) query.getResultList();
		return util.getJSONForObject(seatTypes);
	}

	@Override
	public String getSeatTypeById(Long seatTypeId) {
		Query query = em.createQuery("SELECT f FROM SeatType f WHERE seatTypeId =" + seatTypeId);
		SeatType seatType = (SeatType) query.getSingleResult();
		return util.getJSONForObject(seatType);
	}

	@Override
	public String addNewSeatType(String seatTypeJson) {
		SeatType newSeatType = util.getObjectForJSON(seatTypeJson, SeatType.class);
		em.persist(newSeatType);
		return  "{\"message\": \"seatType sucessfully added\"}" + seatTypeJson;
	}

	@Override
	public String removeSeatType(Long seatTypeId) {
		SeatType seatType = findSeatType(seatTypeId);
		if (seatType != null) {
			em.remove(seatType);
		}
		return "{\"message\": \"seatType sucessfully removed\"}";

	}

	@Override
	public String updateSeatType(Long seatTypeId, String seatTypeUpdate) {
		SeatType updateSeatType = util.getObjectForJSON(seatTypeUpdate, SeatType.class);
		SeatType seatType = findSeatType(seatTypeId);
		if (seatType != null) {
			seatType = updateSeatType;
			em.merge(seatType);
		}
		return "{\"message\": \"seatType sucessfully updated\"}";
	}
	
	private SeatType findSeatType(Long id) {
		return em.find(SeatType.class, id);
	}

}
