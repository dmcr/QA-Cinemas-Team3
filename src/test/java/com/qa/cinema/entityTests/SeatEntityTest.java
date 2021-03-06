package com.qa.cinema.entityTests;

import static org.junit.Assert.*;
import org.junit.Test;
import com.qa.cinema.persistence.Seat;
import com.qa.cinema.persistence.SeatType;

public class SeatEntityTest {

	Seat seat = new Seat();
	
	@Test
	public void testSeat() {
		assertNotNull(seat);
	}
	
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
		SeatType seatType = new SeatType();
		seat.setSeatType(seatType);
		assertSame(seatType, seat.getSeatType());
	}
	
	@Test
	public void testSeatScreen() {
		Seat seat = new Seat();
		seat.setScreenId(1L);
		assertSame(1L, seat.getScreenId());
	}

}