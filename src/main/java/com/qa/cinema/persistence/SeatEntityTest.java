package com.qa.cinema.persistence;

import static org.junit.Assert.*;

import org.junit.Test;

public class SeatEntityTest {

	
	@Test
	public void testSeatId() {
		Seat seat = new Seat();
		seat.setSeatId(1);
		assertEquals(seat.getSeatID(1));
	}
	
	@Test
	public void testSeatRow() {
		Seat seat = new Seat();
		seat.setSeatRow("A");
		assertEquals(seat.getSeatRow("A"));
		
	}
	
	@Test
	public void testSeatNumber() {
		Seat seat = new Seat();
		seat.setSeatNumber(2);
		assertEquals(seat.getSeatRow(2));
		
	}
	@Test
	public void testSeatTypeId() {
		Seat seat = new Seat();
		seat.setSeatTypeId(1);
		assertEquals(seat.getSeatRow(1));
		
	}
	
	@Test
	public void testScreenId() {
		Seat seat = new Seat();
		seat.setScreenId(1);
		assertEquals(seat.getScreenId(1));
		
	}

}