package com.qa.cinema.entityTests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.cinema.persistence.SeatType;

public class SeatTypeJUnitEntity {

	@Test
	public void testGetSeatTypeId() {
 
		SeatType seatType = new SeatType();
		seatType.setSeatTypeId(4);
		assertEquals(4, seatType.getSeatTypeId());
	
	}
	
	@Test
	public void testGetSeatTypePrice() {

		SeatType seatType = new SeatType();
		seatType.setSeatTypePrice(10.00);
		assertEquals(10.00, seatType.getSeatTypePrice());
	
	}
	
	@Test
	public void testGetSeatTypeName() {

		SeatType seatType = new SeatType();
		seatType.setSeatTypeName("child");
		assertEquals("child", seatType.getSeatTypeName());
	
	}
	
	
	
	

}
