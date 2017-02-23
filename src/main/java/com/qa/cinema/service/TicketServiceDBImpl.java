package com.qa.cinema.service;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.qa.cinema.util.JSONUtil;

@Stateless
@Default
public class TicketServiceDBImpl implements TicketService {

	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	@Inject
	private JSONUtil util;
	
	@Override
	public String getAllTickets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTicketByTicketID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAllTicketsByBookingID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
