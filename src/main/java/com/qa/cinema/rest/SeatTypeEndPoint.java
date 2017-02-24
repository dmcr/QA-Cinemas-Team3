package com.qa.cinema.rest;

import javax.inject.Inject;

import com.qa.cinema.service.SeatTypeService;

import javax.ws.rs.*;

@Path("/seattype")
public class SeatTypeEndPoint {

	@Inject
	private SeatTypeService service;
	
	@GET
	@Path("/json")
	@Produces({"application/json"})
	public String getSeatTypeAsJson(){
		return service.listAllSeatTypes();
		
	}
	
	@GET
	@Path("/json/{id}")
	@Produces({"application/json"})
	public String getSeatTypeAsJsonBasedOnId(@PathParam("id") Long typeId){
		return service.listSeatTypeBasedOnId(typeId);
	}
	
}
