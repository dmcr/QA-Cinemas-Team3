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

	private static final String MOCKSTRING = "[{\"screen_id\": 1,\"cin_screen_capacity\": 200,\"screen_type_id\": 14, \"seats\" : [],\"showings\":[] }]";

	@Mock
	private ScreenService mockService;

	@Test
	public void testGetAllScreensAreReturnedCorrectly() {
		Mockito.when(mockService.getAllScreens()).thenReturn(MOCKSTRING);
		String screenString = subject.getScreenAsJson();
		Mockito.verify(mockService).getAllScreens();
		Assert.assertEquals(MOCKSTRING, screenString);
	}
	
	@Test
	public void testGetScreentypebyIdreturnedCorrectly() {
		Mockito.when(mockService.getScreentypebyId(12l)).thenReturn(MOCKSTRING);
		String screenString = subject.getScreenbyIDAsJson(12l);
		Mockito.verify(mockService).getScreentypebyId(12l);
		Assert.assertEquals(MOCKSTRING, screenString);
	}

}