package com.qa.cinema.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.qa.cinema.service.BookingService;
import com.qa.cinema.service.BookingService;

@Path("/booking")
public class BookingEndPoint {
	@Inject
	private BookingService bookingService;

	@GET
	@Path("/json")
	@Produces({ "application/json" })
	public String getAllBookings() {
		return bookingService.getAllBookings();
	}

	@GET
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String getBookingById(@PathParam("id") Long bookingId) {
		return bookingService.getBookingById(bookingId);
	}
	
	@POST
	@Path("/json")
	@Produces({ "application/json" })
	public String addNewBooking(String bookingJson) {
		return bookingService.addNewBooking(bookingJson);
	}

	@PUT
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String updateBooking(@PathParam("id") Long bookingId, String bookingUpdate) {
		return bookingService.updateBooking(bookingId, bookingUpdate);
	}

	@DELETE
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String removeBooking(@PathParam("id") Long bookingId) {
		return bookingService.removeBooking(bookingId);
	}

}
