package com.qa.cinema.entityTests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.cinema.persistence.Seat;

public class SeatEntityTest {

	Seat seat = new Seat();
	
	@Test
	public void testSeatId() {
		seat.setSeatId(1L);
		assertSame(1L, seat.getSeatId());
	}
	
	@Test
	public void testSeatNumber() {
		seat.setNumber(2);
		assertSame(2, seat.getNumber());
	}
	
	@Test
	public void testSeatRow() {
		seat.setRow("A");
		assertSame("A", seat.getRow());
	}
	
	@Test
	public void testSeatType() {
		seat.setSeatType(null);
		assertSame(null,  seat.getSeatType());
	}
	
	@Test
	public void testSeatScreen() {
		seat.setScreen(null);
		assertSame(null, seat.getScreen());
		
	}
	
	@Test
	public void testSeatTicket() {
		seat.setTickets(null);
		assertSame(null, seat.getTickets());
		
	}

}