
package com.qa.cinema.service;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qa.cinema.persistence.Film;
import com.qa.cinema.persistence.Seat;
import com.qa.cinema.persistence.Showing;
import com.qa.cinema.util.JSONUtil;

@Stateless
@Default
public class ShowingServiceDBImp implements ShowingService{

	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	@Inject
	private JSONUtil util;
	
	@Override
	public String getAllShowings(){
		Query query = em.createQuery("SELECT s FROM Showings s");
		Collection<Showing> showing = (Collection<Showing>) query.getResultList();
		return util.getJSONForObject(showing);
	}

	@Override
	public String getShowingBasedOnId(Long showingId) {
		Query query = em.createQuery("SELECT s FROM Showing s WHERE showingId ="+showingId);
		Showing showing = (Showing)query.getSingleResult();
		return util.getJSONForObject(showing);
	}

}