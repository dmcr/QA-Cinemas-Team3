package com.qa.cinema.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.qa.cinema.service.TicketService;

@Path("/tickets")
public class TicketEndPoint {

	@SuppressWarnings("unused")
	@Inject
	private TicketService ticketService;
	
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public String getTicketsAsJson() {
		return "";
	}
	
	@GET
	@Path("/json/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getTicketByTicketIDAsJson(@PathParam("id") Long id) {
		return "";
	}
	
	@GET
	@Path("/json/booking/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getTicketsByBookingTicketIDAsJson(@PathParam("id") Long id) {
		return "";
	}
}
