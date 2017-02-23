package com.qa.cinema.rest;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.cinema.service.seatService;

@Path("/seat")
public class SeatEndPoint {
	
	@Inject
	private seatService seatService;
	
	@GET
	@Path("/json")
	@Produces({"application/json"})
	
	public String getAllSeatAsJson() {
		
		return seatService.getAllSeats();
	}
	
	@GET
	@Path("/json/{id}")
	@Produces({"application/json"})
	
	public String getSeatAsJson(@PathParam("id")Long id) {
		
		return seatService.getSeatById(id);
	}

}
