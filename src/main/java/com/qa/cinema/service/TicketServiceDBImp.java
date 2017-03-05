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
		Query query = em.createQuery("SELECT m FROM Ticket m");
		@SuppressWarnings("unchecked")
		Collection<Ticket> tickets = (Collection<Ticket>) query.getResultList();
		return util.getJSONForObject(tickets);
	}

	@Override
	public String getTicketById(Long ticketId) {
		Query query = em.createQuery("SELECT f FROM Ticket f WHERE ticketId =" + ticketId);
		Ticket ticket = (Ticket) query.getSingleResult();
		return util.getJSONForObject(ticket);
	}

	@Override
	public String addNewTicket(String ticketJson) {
		Ticket newTicket = util.getObjectForJSON(ticketJson, Ticket.class);
		em.persist(newTicket);
		return  "{\"message\": \"ticket sucessfully added\"}" + ticketJson;
	}

	@Override
	public String removeTicket(Long ticketId) {
		Ticket ticket = findTicket(ticketId);
		if (ticket != null) {
			em.remove(ticket);
		}
		return "{\"message\": \"ticket sucessfully removed\"}";

	}

	@Override
	public String updateTicket(Long ticketId, String ticketUpdate) {
		Ticket updateTicket = util.getObjectForJSON(ticketUpdate, Ticket.class);
		Ticket ticket = findTicket(ticketId);
		if (ticket != null) {
			ticket = updateTicket;
			em.merge(ticket);
		}
		return "{\"message\": \"ticket sucessfully updated\"}";
	}
	
	private Ticket findTicket(Long id) {
		return em.find(Ticket.class, id);
	}

}
