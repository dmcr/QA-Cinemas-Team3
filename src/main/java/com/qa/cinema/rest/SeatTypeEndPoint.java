package com.qa.cinema.rest;

import javax.inject.Inject;

import com.qa.cinema.service.SeatTypeService;

import javax.ws.rs.*;

@Path("/seattype")
public class SeatTypeEndPoint {

	@Inject
	private SeatTypeService seatTypeService;

	@GET
	@Path("/json")
	@Produces({ "application/json" })
	public String getAllSeatTypes() {
		return seatTypeService.getAllSeatTypes();
	}

	@GET
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String getSeatTypeById(@PathParam("id") Long seatTypeId) {
		return seatTypeService.getSeatTypeById(seatTypeId);
	}
	
	@POST
	@Path("/json")
	@Produces({ "application/json" })
	public String addNewSeatType(String seatTypeJson) {
		return seatTypeService.addNewSeatType(seatTypeJson);
	}

	@PUT
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String updateSeatType(@PathParam("id") Long seatTypeId, String seatTypeUpdate) {
		return seatTypeService.updateSeatType(seatTypeId, seatTypeUpdate);
	}

	@DELETE
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String removeSeatType(@PathParam("id") Long seatTypeId) {
		return seatTypeService.removeSeatType(seatTypeId);
	}

}
