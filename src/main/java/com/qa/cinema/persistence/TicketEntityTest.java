package com.qa.cinema.persistence;

import static org.junit.Assert.*;

import org.junit.Test;

public class TicketEntityTest {

	@Test
	public void testTicket() {
		assertNotNull(new Ticket());
		assertNotNull(new Ticket(0, 0, "adult", 0));
	}
	
	@Test
	public void testGetTicketId() {
		Ticket ticket = new Ticket();
		ticket.setTicketId(5);
		assertEquals(5, ticket.getTicketId());
	}
	
	@Test
	public void testGetBookingId() {
		Ticket ticket = new Ticker();
		ticket.setBookingId(5);
		assertEquals(5, ticket.getBookingId);
	}

	@Test
	public void testGetTicketType() {
		Ticket ticket = new Ticket();
		ticket.setType("child");
		assertEquals("child", ticket.getType());
	}
	
	@Test
	public void ticketGetSeatId() {
		Ticket ticket = new Ticket();
		ticket.setSeatId(5);
		assertEquals(5, ticket.getSeatId());
	}
}
