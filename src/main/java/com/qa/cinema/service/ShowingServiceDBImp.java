
package com.qa.cinema.service;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getShowingBasedOnId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}