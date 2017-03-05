package com.qa.cinema.service;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.qa.cinema.persistence.Screen;
import com.qa.cinema.util.JSONUtil;

@Stateless
@Default
public class ScreenServiceDBImp implements ScreenService {

	@PersistenceContext(unitName="primary")
	private EntityManager em;
	
	@Inject
	private JSONUtil util;

	@Override
	public String getAllScreens() {
		Query query = em.createQuery("SELECT m FROM Screen m");
		@SuppressWarnings("unchecked")
		Collection<Screen> screens = (Collection<Screen>) query.getResultList();
		return util.getJSONForObject(screens);
	}

	@Override
	public String getScreenById(Long screenId) {
		Query query = em.createQuery("SELECT f FROM Screen f WHERE screenId =" + screenId);
		Screen screen = (Screen) query.getSingleResult();
		return util.getJSONForObject(screen);
	}

	@Override
	public String addNewScreen(String screenJson) {
		Screen newScreen = util.getObjectForJSON(screenJson, Screen.class);
		em.persist(newScreen);
		return  "{\"message\": \"screen sucessfully added\"}" + screenJson;
	}

	@Override
	public String removeScreen(Long screenId) {
		Screen screen = findScreen(new Long(screenId));
		if (screen != null) {
			em.remove(screen);
		}
		return "{\"message\": \"screen sucessfully removed\"}";

	}

	@Override
	public String updateScreen(Long screenId, String screenUpdate) {
		Screen updateScreen = util.getObjectForJSON(screenUpdate, Screen.class);
		Screen screen = findScreen(new Long(screenId));
		if (screen != null) {
			screen = updateScreen;
			em.merge(screen);
		}
		return "{\"message\": \"screen sucessfully updated\"}";
	}
	
	private Screen findScreen(Long id) {
		return em.find(Screen.class, id);
	}


	
	
	

}