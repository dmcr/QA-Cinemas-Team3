package com.qa.cinema.entityTests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.cinema.persistence.Screen;

public class ScreenTest {

	@Test
	public void getScreenIDtest() {
		Screen screen = new Screen();
		assertEquals(12,screen.getScreenId());
	}
	
	@Test
	public void getScreentypeIDtest() {
		Screen screen = new Screen();
		assertEquals(34,screen.getScreenTypeId());
	}
	
	@Test
	public void getScreencapacitytest() {
		Screen screen = new Screen();
		assertEquals(100,screen.getCinScreenCapacity());
	}

	@Test
	public void setscreenIDTest() {
		Screen screen = new Screen();
		screen.setScreenId(12345L);
		assertEquals(12345L,screen.getScreenId());
	}
	
	@Test
	public void setscreentypeIDTest() {
		Screen screen = new Screen();
		screen.setScreenTypeId(45L);
		assertEquals(45L, screen.getScreenTypeId());
	}
	
	@Test
	public void setscreencapacityTest() {
		Screen screen = new Screen();
		screen.setCinScreenCapacity(200);
		assertEquals(200,screen.getCinScreenCapacity());
	}
	
}
