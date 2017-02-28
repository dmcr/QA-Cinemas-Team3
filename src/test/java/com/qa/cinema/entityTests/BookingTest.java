package com.qa.cinema.entityTests;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.qa.cinema.persistence.Booking;
import com.qa.cinema.persistence.Ticket;

public class BookingTest {
	
	@Test
	public void testBooking() {
		Booking booking = new Booking();
		assertNotNull(booking);
	}
	
	@Test
	public void testGetBookingId() {
		Booking booking = new Booking();
		booking.setBookingId(1L);
		assertSame(1L, booking.getBookingId());
	}
	
	@Test
	public void testGetBookingComplete()  {
		Booking booking = new Booking();
		booking.setComplete(true);
		assertEquals(true, booking.getComplete());
	}
	
	@Test
	public void testGetPaypalBookingID() {
		Booking booking = new Booking();
		booking.setPaypal("example1345");
		assertEquals("example1345", booking.getPaypal());
	}
	
//	@Test
//	public void testGetBookingTickets() {
//		List<Ticket> tickets = new ArrayList<Ticket>();
//		Booking booking = new Booking();
//		booking.setTickets(tickets);
//		assertEquals(tickets, booking.getTickets());
//	}
}
