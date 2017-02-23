package com.qa.cinema.entityTests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.qa.cinema.persistence.Screen;
import com.qa.cinema.persistence.Seat;

public class ScreenTest {
	
	Screen screen = new Screen();
	
	@Test
	public void screenTest() {
		assertNotNull(screen);
	}
	
	@Test
	public void getScreenIDTest() {
		screen.setScreenId(12L);
		assertSame(12L, screen.getScreenId());
	}
	
	@Test
	public void getScreenTypeIDTest() {
		screen.setScreenTypeId(34L);
		assertSame(34L,screen.getScreenTypeId());
	}
	
	@Test
	public void getScreenCapacityTest() {
		screen.setCinScreenCapacity(100);
		assertEquals(100,screen.getCinScreenCapacity());
	}
	
	@Test
	public void getSeatsTest() {
		List<Seat> seats = new ArrayList<Seat>();
		screen.setSeats(seats);
		assertEquals(seats, screen.getSeats());
	}
	
	
	
}
