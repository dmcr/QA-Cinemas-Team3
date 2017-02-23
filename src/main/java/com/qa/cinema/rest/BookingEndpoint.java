package com.qa.cinema.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.qa.cinema.service.BookingService;

@Path("/booking")
public class BookingEndpoint {
	@Inject
	private BookingService booking;
	
	@GET
	@Path("/json")
	@Produces({ "application/json" })
	public String getAllBookings(){
		return booking.getAllBookings();
	}
	
	@GET
	@Path("/json")
	@Produces({ "application/json" })
	public String getBookingAsJson(Long bookingID){
		return booking.getBookingByID(bookingID);
	}
}
