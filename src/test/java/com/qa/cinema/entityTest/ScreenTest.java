package com.qa.cinema.entityTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class ScreenTest {

	@Test
	public void getScreenIDtest() {
		Screen a = new Screen(12,34,100);
		assertEquals(12,a.getScreenId());
	}
	
	@Test
	public void getScreentypeIDtest() {
		Screen a = new Screen(12,34,100);
		assertEquals(34,a.getScreenTypeId());
	}
	
	@Test
	public void getScreencapacitytest() {
		Screen a = new Screen(12,34,100);
		assertEquals(100,a.getScreencapacity());
	}

	@Test
	public void setscreenIDTest() {
		Screen a = new Screen(12,34,100);
		a.setScreenId(12345);
		assertEquals(12345,a.getScreenId());
	}
	
	@Test
	public void setscreentypeIDTest() {
		Screen a = new Screen(12,34,100);
		a.setScreenTypeId(45);
		assertEquals(45,a.getScreenTypeId());
	}
	
	@Test
	public void setscreencapacityTest() {
		Screen a = new Screen(12,34,100);
		a.setScreencapacity(200);
		assertEquals(200,a.getScreencapacity());
	}
	
}
