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
public class ScreenServiceDBImpl implements ScreenService {

	@PersistenceContext(unitName="primary")
	private EntityManager em;
	
	@Inject
	private JSONUtil util;

	@SuppressWarnings("unchecked")
	@Override
	public String getAllScreens() {
		Query query = em.createQuery("SELECT s FROM Screen s");
		Collection<Screen> screens = (Collection<Screen>) query.getResultList();
		return util.getJSONForObject(screens);
	}

	@Override
	public String getScreentypebyId(Long id) {
		Query query = em.createQuery("SELECT s FROM Screen s where s=" + id);
		Screen screen = (Screen) query.getSingleResult();
		return util.getJSONForObject(screen);
	}

	
	
	

}