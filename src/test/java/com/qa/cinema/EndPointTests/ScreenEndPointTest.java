package com.qa.cinema.EndPointTests;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.cinema.rest.*;
import com.qa.cinema.service.ScreenService;
import com.qa.cinema.service.ScreenService;

@RunWith(MockitoJUnitRunner.class)
public class ScreenEndPointTest {

	@InjectMocks
	private ScreenEndPoint screen;

	private static final String MOCKSCREENALL = "[{\"screenId\": 1,\"cinScreenCapacity\": 200, \"seats\" : ["
			+ "{\"seatId\": 1, \"number\" 1, \"row\": \"A\", \"seatType\": {\"typeId\", \"name\": \"standard\", \"price\": 10}, \"screenId\": 1 }],"
			+ "\"showings\":[{\"showingId\": 1, \"startTime\": \"Jun 17, 0018 12:10:08 PM\", \"screenId\": 1, \"screenId\": 1 }]}]";
	private static final String MOCKSCREEN = "{\"screenId\": 1,\"cinScreenCapacity\": 200, \"seats\" : ["
			+ "{\"seatId\": 1, \"number\" 1, \"row\": \"A\", \"seatType\": {\"typeId\", \"name\": \"standard\", \"price\": 10}, \"screenId\": 1 }],"
			+ "\"showings\":[{\"showingId\": 1, \"startTime\": \"Jun 17, 0018 12:10:08 PM\", \"screenId\": 1, \"screenId\": 1 }]}";

	@Mock
	private ScreenService screenServiceMock;
	
	@Test
	public void testGetAllScreens() {
		Mockito.when(screenServiceMock.getAllScreens()).thenReturn(MOCKSCREENALL);
		String screenString = screen.getAllScreens();
		Mockito.verify(screenServiceMock).getAllScreens();
		assertEquals(MOCKSCREENALL, screenString);
	}
	
	@Test
	public void testGetScreenById() {
		Mockito.when(screenServiceMock.getScreenById(1l)).thenReturn(MOCKSCREEN);
		String screenString = screen.getScreenById(1l);
		Mockito.verify(screenServiceMock).getScreenById(1l);
		assertEquals(MOCKSCREEN, screenString);
	}
		
	@Test
	public void testAddNewScreen() {
		Mockito.when(screenServiceMock.addNewScreen(MOCKSCREEN)).thenReturn(MOCKSCREEN);
		String screenString = screen.addNewScreen(MOCKSCREEN);
		Mockito.verify(screenServiceMock).addNewScreen(MOCKSCREEN);
		assertEquals(MOCKSCREEN, screenString);
	}
	
	
	@Test
	public void testRemoveScreen() {
		Mockito.when(screenServiceMock.removeScreen(Mockito.anyLong())).thenReturn("Screen removed successfully");
		String deleteMessage = screen.removeScreen(1l);
		Mockito.verify(screenServiceMock).removeScreen(1l);
		assertEquals("Screen removed successfully", deleteMessage);
	}
	
	
	@Test
	public void testUpdateScreen() {
		Mockito.when(screenServiceMock.updateScreen(2l, MOCKSCREEN)).thenReturn(MOCKSCREEN);
		String screenString = screen.updateScreen(2l, MOCKSCREEN);
		Mockito.verify(screenServiceMock).updateScreen(2l, MOCKSCREEN);
		assertEquals(MOCKSCREEN, screenString);
	}
}