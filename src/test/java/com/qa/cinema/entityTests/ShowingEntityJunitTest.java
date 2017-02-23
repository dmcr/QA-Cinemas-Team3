package com.qa.cinema.entityTests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.cinema.persistence.Showing;


public class ShowingEntityJunitTest {

	Showing showing = new Showing();
	
	@Test
	public void showingIDTest() {
		showing.setShowingId(1L);
		assertSame(1L, showing.getShowingId());
	}
	
	@Test
	public void showingStartTimeTest() {
		showing.setStartTime(null);
		assertEquals("16:00", showing.getStartTime());
	}
	
	@Test
	public void showingScreen() {
		showing.setScreen(null);
		assertEquals(4, showing.getScreen());
	}
	
	@Test
	public void showingFilmTest() {
		showing.setFilm(null);
		assertEquals(3, showing.getFilm());
	}
	
	@Test
	public void showingTicketTest() {
		showing.setTickets(null);
		assertEquals(3, showing.getTickets());
	}
	
	
} 