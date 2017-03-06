package com.qa.cinema.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.qa.cinema.service.TicketService;

@Path("/ticket")
public class TicketEndPoint {

	@Inject
	private TicketService ticketService;

	@GET
	@Path("/json")
	@Produces({ "application/json" })
	public String getAllTickets() {
		return ticketService.getAllTickets();
	}

	@GET
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String getTicketById(@PathParam("id") Long ticketId) {
		return ticketService.getTicketById(ticketId);
	}
	
	@POST
	@Path("/json")
	@Produces({ "application/json" })
	public String addNewTicket(String ticketJson) {
		return ticketService.addNewTicket(ticketJson);
	}

	@PUT
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String updateTicket(@PathParam("id") Long ticketId, String ticketUpdate) {
		return ticketService.updateTicket(ticketId, ticketUpdate);
	}

	@DELETE
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String removeTicket(@PathParam("id") Long ticketId) {
		return ticketService.removeTicket(ticketId);
	}

}
