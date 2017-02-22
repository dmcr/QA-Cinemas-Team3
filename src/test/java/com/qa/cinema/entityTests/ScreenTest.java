package com.qa.cinema.entityTests;

import static org.junit.Assert.*;

import org.junit.Test;

public class ScreenTest {

	@Test
	public void getScreenIDtest() {
		Screen screen = new Screen(12,34,100);
		assertEquals(12,screen.getScreenId());
	}
	
	@Test
	public void getScreentypeIDtest() {
		Screen screen = new Screen(12,34,100);
		assertEquals(34,screen.getScreenTypeId());
	}
	
	@Test
	public void getScreencapacitytest() {
		Screen screen = new Screen(12,34,100);
		assertEquals(100,screen.getScreencapacity());
	}

	@Test
	public void setscreenIDTest() {
		Screen screen = new Screen(12,34,100);
		screen.setScreenId(12345);
		assertEquals(12345,screen.getScreenId());
	}
	
	@Test
	public void setscreentypeIDTest() {
		Screen screen = new Screen(12,34,100);
		screen.setScreenTypeId(45);
		assertEquals(45,screen.getScreenTypeId());
	}
	
	@Test
	public void setscreencapacityTest() {
		Screen screen = new Screen(12,34,100);
		screen.setScreencapacity(200);
		assertEquals(200,screen.getScreencapacity());
	}
	
}
