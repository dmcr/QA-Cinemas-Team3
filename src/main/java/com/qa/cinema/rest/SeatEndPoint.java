package com.qa.cinema.rest;


import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.cinema.service.SeatService;

@Path("/seat")
public class SeatEndPoint {
	
	@Inject
	private SeatService seatService;
	
	@GET
	@Path("/json")
	@Produces({"application/json"})
	public String getAllSeats() {
		return seatService.getAllSeats();
	}
	
	@GET
	@Path("/json/{id}")
	@Produces({"application/json"})
	public String getSeatById(@PathParam("id")Long id) {
		return seatService.getSeatById(id);
	}

	@POST
	@Path("/json")
	@Produces({ "application/json" })
	public String addNewSeat(String seatJson) {
		return seatService.addNewSeat(seatJson);
	}

	@PUT
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String updateSeat(@PathParam("id") Long seatId, String seatUpdate) {
		return seatService.updateSeat(seatId, seatUpdate);
	}

	@DELETE
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String removeSeat(@PathParam("id") Long seatId) {
		return seatService.removeSeat(seatId);
	}

}
