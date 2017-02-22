package com.qa.cinema.entityTests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.cinema.persistence.Screen;

public class ScreenTest {
	
	Screen screen = new Screen();
	@Test
	
	public void getScreenIDtest() {
		assertSame(12,screen.getScreenId());
	}
	
	@Test
	public void getScreentypeIDtest() {
		assertSame(34,screen.getScreenTypeId());
	}
	
	@Test
	public void getScreencapacitytest() {
		assertEquals(100,screen.getCinScreenCapacity());
	}

	@Test
	public void setscreenIDTest() {
		screen.setScreenId(12345L);
		assertSame(12345L,screen.getScreenId());
	}
	
	@Test
	public void setscreentypeIDTest() {
		screen.setScreenTypeId(45L);
		assertSame(45L, screen.getScreenTypeId());
	}
	
	@Test
	public void setscreencapacityTest() {
		screen.setCinScreenCapacity(200);
		assertEquals(200,screen.getCinScreenCapacity());
	}
	
}
