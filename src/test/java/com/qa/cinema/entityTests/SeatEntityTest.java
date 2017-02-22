package com.qa.cinema.entityTests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.cinema.persistence.Seat;

public class SeatEntityTest {

	Seat seat = new Seat();
	
	@Test
	public void testSeatId() {
		seat.setSeatId(1L);
		assertEquals(seat.getSeatId());
	}
	
	@Test
	public void testSeatNumber() {
		seat.setNumber(2);
		assertEquals(seat.getNumber());
	}
	
	@Test
	public void testSeatRow() {
		seat.setRow("A");
		assertEquals(seat.getRow());
	}
	
	@Test
	public void testSeatType() {
		seat.setSeatType(null);
		assertEquals(seat.getSeatType());
	}
	
	@Test
	public void testScreenId() {
		seat.setScreenId(1);
		assertEquals(seat.getScreenId(1));
		
	}

}