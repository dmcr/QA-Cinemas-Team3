package com.qa.cinema.service;

import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qa.cinema.util.JSONUtil;

public class DBSeatTypeService implements SeatTypeService{

	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	@Inject
	private JSONUtil util;
	
	public String listAllSeatTypes(){	
		Query query = em.createQuery("SELECT m FROM Movie m");
		Collection<SeatType> movies = (Collection<Movie>) query.getResultList();
		return util.getJSONForObject(movies);
	};
	
	
	public String listSeatTypeBasedOnId(Long SeatId){
		return null;
	};
}
