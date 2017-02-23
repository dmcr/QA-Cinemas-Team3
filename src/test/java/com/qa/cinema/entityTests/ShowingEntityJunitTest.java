package com.qa.cinema.entityTests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import com.qa.cinema.persistence.Film;
import com.qa.cinema.persistence.Screen;
import com.qa.cinema.persistence.Showing;
import com.qa.cinema.persistence.Ticket;


public class ShowingEntityJunitTest {

	Showing showing = new Showing();
	
	@Test
	public void showingTest() {
		assertNotNull(showing);
	}
	
	@Test
	public void showingIDTest() {
		showing.setShowingId(1L);
		assertSame(1L, showing.getShowingId());
	}
	
	@Test
	public void showingStartTimeTest() {
		Date date = new Date(23/03/1993);
		showing.setStartTime(date);
		assertEquals(date, showing.getStartTime());
	}
	
	@Test
	public void showingScreenTest() {
		Screen screen = new Screen();
		showing.setScreen(screen);
		assertEquals(screen, showing.getScreen());
	}
	
	@Test
	public void showingFilmTest() {
		Film film = new Film();
		showing.setFilm(film);
		assertEquals(film, showing.getFilm());
	}
	
	@Test
	public void showingTicketTest() {
		ArrayList<Ticket> tickets = new ArrayList<Ticket>();
		showing.setTickets(tickets);
		assertEquals(tickets, showing.getTickets());
	}
	
	
} 