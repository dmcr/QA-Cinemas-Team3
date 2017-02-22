package com.qa.cinema.persistence;

import static org.junit.Assert.*;

import org.junit.Test;

public class SeatTypeJUnitEntity {

	@Test
	public void testSeatTypeId() {

		SeatType seatType = new SeatType();
		seatType.setSeatTypeId(4);
		assertEquals(seatType.getSeatTypeId(), 4);
	
	}
	
	@Test
	public void testSeatTypePrice() {

		SeatType seatType = new SeatType();
		seatType.setSeatTypePrice(10.00);
		assertEquals(seatType.getSeatTypePrice(), 10.00);
	
	}
	
	@Test
	public void testSeatTypeName() {

		SeatType seatType = new SeatType();
		seatType.setSeatTypeName("child");
		assertEquals(seatType.getSeatTypeName(), "child");
	
	}
	
	

}
