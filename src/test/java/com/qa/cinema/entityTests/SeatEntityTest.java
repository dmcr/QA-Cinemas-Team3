package com.qa.cinema.entityTests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.qa.cinema.persistence.Screen;
import com.qa.cinema.persistence.Seat;
import com.qa.cinema.persistence.SeatType;
import com.qa.cinema.persistence.Ticket;

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
		SeatType seatType = new SeatType();
		seat.setSeatType(seatType);
		assertSame(seatType, seat.getSeatType());
	}
	
	@Test
	public void testSeatScreen() {
		Screen screen = new Screen();
		seat.setScreen(screen);
		assertSame(screen, seat.getScreen());
		
	}
	
	@Test
	public void testSeatTicket() {
		List<Ticket> tickets = new ArrayList<Ticket>();
		seat.setTickets(tickets);
		assertSame(tickets, seat.getTickets());
		
	}

}