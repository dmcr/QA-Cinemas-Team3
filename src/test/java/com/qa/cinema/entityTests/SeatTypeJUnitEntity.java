package com.qa.cinema.entityTests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.cinema.persistence.SeatType;

public class SeatTypeJUnitEntity {

	SeatType seatType = new SeatType();
	
	@Test
	public void testSeatTypeId() {
		seatType.setTypeId(4L);
		assertSame(4, seatType.getTypeId());

	}
	
	@Test
	public void testSeatName() {
		seatType.setName("Test");
		assertEquals(4, seatType.getName());

	}

	@Test
	public void testSeatTypePrice() {
		seatType.setPrice(10.00);
		assertSame(10.00, seatType.getPrice());

	}

	@Test
	public void testSeatType() {
		seatType.setSeats(null);
		assertEquals("child", seatType.getSeats());

	}

	
}
