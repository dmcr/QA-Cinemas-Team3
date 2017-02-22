package com.qa.cinema.entityTests;

import static org.junit.Assert.*;

import org.junit.Test;


public class ShowingEntityJunitTest {

	@Test
	public void showingIDTest() {
		Showing s1 = new Showing(1, 1, "", 1);
		assertEquals(1, s1.getShowingID());
	}
	
	@Test
	public void showingStartTimeTest() {
		Showing s2 = new Showing(2, 2, "", 2);
		assertEquals("16:00", s2.getShowingStartTime());
	}
	
	@Test
	public void showingFilmIDTest() {
		Showing s3 = new Showing(3, 3,"", 3);
		assertEquals(3, s3.getshowingFilmID());
	}
	
	@Test
	public void showingScreenID() {
		Showing s4 = new Showing(4, 4, "", 4);
		assertEquals(4, s4.getShowingScreenID());
	}
	
	@Test
	public void setShowingIDTest() {
		Showing s5 = new Showing();
		s5.setShowingID(5);
		assertEquals(5, s5.setShowingID());
	}
	
	@Test
	public void setShowingStartTimeTest() {
		Showing s6 = new Showing();
		s6.setShowingStartTime("15:00");
		assertEquals("15:00", s6.setShowingID());
	}
	
	@Test
	public void setShowingFilmIDTest() {
		Showing s7 = new Showing();
		s7.setShowingFilmID(7);
		assertEquals(7, s7.setShowingFilmIDTest);
	}

	@Test
	public void setShowingScreenIDTest() {
		Showing s8 = new Showing();
		s8.setShowingScreenID(8);
		assertEquals(8, s8.setShowingScreenID());
	}
}