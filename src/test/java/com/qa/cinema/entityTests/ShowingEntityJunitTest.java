package com.qa.cinema.entityTests;

import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Test;
import com.qa.cinema.persistence.Showing;


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
		showing.setScreenId(1L);
		assertSame(1L, showing.getScreenId());
	}
	
	@Test
	public void showingFilmTest() {
		showing.setFilmId(1L);
		assertSame(1L, showing.getFilmId());
	}
	
	
	
} 