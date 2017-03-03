package com.qa.cinema.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.qa.cinema.service.BookingService;

@Path("/booking")
public class BookingEndPoint {
	@Inject
	private BookingService bookingService;
	
	@GET
	@Path("/json")
	@Produces({ "application/json" })
	public String getBookingAsJson(){
		return bookingService.getAllBookings();
	}
	
	@GET
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String getBookingAsJsonFromID(@PathParam("id") Long bookingID){
		return bookingService.getBookingByID(bookingID);
	}
	
	@POST
	@Path("/json/new")
	@Produces(MediaType.APPLICATION_JSON)
	public String createNewBooking() {
		return bookingService.createNewBooking();
	}
}
