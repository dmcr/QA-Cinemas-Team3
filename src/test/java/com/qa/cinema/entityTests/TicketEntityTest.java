package com.qa.cinema.entityTests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.cinema.persistence.Booking;
import com.qa.cinema.persistence.Seat;
import com.qa.cinema.persistence.Showing;
import com.qa.cinema.persistence.Ticket;

public class TicketEntityTest {

	Ticket ticket = new Ticket();
	
	@Test
	public void testTicket() {
		assertNotNull(new Ticket());
		assertNotNull(new Ticket(0L, new Booking(), new Showing(), new Seat()));
	}
	
	@Test
	public void testGetTicketId() {
		ticket.setTicketId(5L);
		assertSame(5L, ticket.getTicketId());
	}
	
	@Test
	public void testGetBooking() {
		Booking booking = new Booking();
		ticket.setBooking(booking);
		assertEquals(booking, ticket.getBooking());
	}

	@Test
	public void testGetTicketShowing() {
		Showing showing = new Showing();
		ticket.setShowing(showing);
		assertEquals(showing, ticket.getShowing());
	}
	
	@Test
	public void ticketGetSeat() {
		Seat seat = new Seat();
		ticket.setSeat(seat);
		assertEquals(seat, ticket.getSeat());
	}
}
