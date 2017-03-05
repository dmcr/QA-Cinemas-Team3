
package com.qa.cinema.service;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
	public String getAllShowings() {
		Query query = em.createQuery("SELECT m FROM Showing m");
		@SuppressWarnings("unchecked")
		Collection<Showing> showings = (Collection<Showing>) query.getResultList();
		return util.getJSONForObject(showings);
	}

	@Override
	public String getShowingById(Long showingId) {
		Query query = em.createQuery("SELECT f FROM Showing f WHERE showingId =" + showingId);
		Showing showing = (Showing) query.getSingleResult();
		return util.getJSONForObject(showing);
	}

	@Override
	public String addNewShowing(String showingJson) {
		Showing newShowing = util.getObjectForJSON(showingJson, Showing.class);
		em.persist(newShowing);
		return  "{\"message\": \"showing sucessfully added\"}" + showingJson;
	}

	@Override
	public String removeShowing(Long showingId) {
		Showing showing = findShowing(showingId);
		if (showing != null) {
			em.remove(showing);
		}
		return "{\"message\": \"showing sucessfully removed\"}";

	}

	@Override
	public String updateShowing(Long showingId, String showingUpdate) {
		Showing updateShowing = util.getObjectForJSON(showingUpdate, Showing.class);
		Showing showing = findShowing(showingId);
		if (showing != null) {
			showing = updateShowing;
			em.merge(showing);
		}
		return "{\"message\": \"showing sucessfully updated\"}";
	}
	
	private Showing findShowing(Long id) {
		return em.find(Showing.class, id);
	}
}