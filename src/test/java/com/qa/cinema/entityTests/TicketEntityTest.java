package com.qa.cinema.entityTests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.cinema.persistence.Ticket;

public class TicketEntityTest {

	Ticket ticket = new Ticket();
	
	@Test
	public void testTicket() {
		assertNotNull(new Ticket());
		assertNotNull(new Ticket(0L, null, null, null));
	}
	
	@Test
	public void testGetTicketId() {
		ticket.setTicketId(5L);
		assertSame(5L, ticket.getTicketId());
	}
	
	@Test
	public void testGetBooking() {
		ticket.setBooking(null);
		assertEquals(5, ticket.getBooking());
	}

	@Test
	public void testGetTicketShowing() {
		ticket.setShowing(null);
		assertEquals("child", ticket.getShowing());
	}
	
	@Test
	public void ticketGetSeat() {
		ticket.setSeat(null);
		assertEquals(5, ticket.getSeat());
	}
}
