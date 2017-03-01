package com.qa.cinema.EndPointTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.cinema.rest.*;
import com.qa.cinema.service.ScreenService;

@RunWith(MockitoJUnitRunner.class)
public class ScreenEndPointTest {

	@InjectMocks
	private ScreenEndPoint subject;

	private static final String MOCKSTRINGALL = "[{\"screenId\": 1,\"cinScreenCapacity\": 200, \"seats\" : ["
			+ "{\"seatId\": 1, \"number\" 1, \"row\": \"A\", \"seatType\": {\"typeId\", \"name\": \"standard\", \"price\": 10}, \"screenId\": 1 }],"
			+ "\"showings\":[{\"showingId\": 1, \"startTime\": \"Jun 17, 0018 12:10:08 PM\", \"screenId\": 1, \"filmId\": 1 }]}]";
	private static final String MOCKSTRING = "{\"screenId\": 1,\"cinScreenCapacity\": 200, \"seats\" : ["
			+ "{\"seatId\": 1, \"number\" 1, \"row\": \"A\", \"seatType\": {\"typeId\", \"name\": \"standard\", \"price\": 10}, \"screenId\": 1 }],"
			+ "\"showings\":[{\"showingId\": 1, \"startTime\": \"Jun 17, 0018 12:10:08 PM\", \"screenId\": 1, \"filmId\": 1 }]}";

	@Mock
	private ScreenService mockService;

	@Test
	public void testGetAllScreensAreReturnedCorrectly() {
		Mockito.when(mockService.getAllScreens()).thenReturn(MOCKSTRINGALL);
		String screenString = subject.getScreenAsJson();
		Mockito.verify(mockService).getAllScreens();
		Assert.assertEquals(MOCKSTRINGALL, screenString);
	}
	
	@Test
	public void testGetScreentypebyIdreturnedCorrectly() {
		Mockito.when(mockService.getScreentypebyId(1l)).thenReturn(MOCKSTRING);
		String screenString = subject.getScreenbyIDAsJson(1l);
		Mockito.verify(mockService).getScreentypebyId(1l);
		Assert.assertEquals(MOCKSTRING, screenString);
	}

}