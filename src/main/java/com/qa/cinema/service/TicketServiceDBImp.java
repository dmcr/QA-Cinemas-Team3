package com.qa.cinema.service;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.qa.cinema.persistence.Ticket;
import com.qa.cinema.util.JSONUtil;

@Stateless
@Default
public class TicketServiceDBImp implements TicketService {

	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	@Inject
	private JSONUtil util;
	
	@Override
	public String getAllTickets() {
		Query query = em.createQuery("SELECT t FROM Ticket t");
		Collection<Ticket> tickets = (Collection<Ticket>) query.getResultList();
		return util.getJSONForObject(tickets);
	}

	@Override
	public String getTicketByTicketID(Long id) {
		Query query = em.createQuery("SELECT t FROM Ticket t WHERE t.ticketId = " + id);
		Ticket ticket = (Ticket) query.getSingleResult();
		return util.getJSONForObject(ticket);
	}

}
