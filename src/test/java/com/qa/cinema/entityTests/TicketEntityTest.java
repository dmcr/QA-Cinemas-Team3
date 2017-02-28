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
		assertNotNull(new Ticket(1L, 1L, new Showing(), new Seat()));
	}
	
	@Test
	public void testGetTicketId() {
		ticket.setTicketId(5L);
		assertSame(5L, ticket.getTicketId());
	}
	
	@Test
	public void testGetBooking() {
		ticket.setBookingId(1L);
		assertSame(1L, ticket.getBookingId());
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
