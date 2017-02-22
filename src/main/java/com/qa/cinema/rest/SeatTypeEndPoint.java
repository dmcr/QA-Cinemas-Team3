package com.qa.cinema.rest;

import javax.inject.Inject;
import javax.ws.rs.*;

import com.qa.cinema.service.SeatTypeService;

@Path("seattype")
public class SeatTypeEndPoint {

	@Inject
	private SeatTypeService seatType;
	
	@GET
	@Path("json")
	@Produces({"application/json"})
	public String getSeatTypeAsJson(){
		return null;
		
	}
	
	@GET
	@Path("json")
	@Produces({"application/json"})
	public String getSeatTypeAsJsonBasedOnId(Long id){
		return null;
	}
	
}
