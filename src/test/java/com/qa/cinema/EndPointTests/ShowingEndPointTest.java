package com.qa.cinema.EndPointTests;

import org.junit.Assert;
import com.qa.cinema.rest.ShowingEndPoint;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import com.qa.cinema.service.ShowingService;

@RunWith(MockitoJUnitRunner.class)

public class ShowingEndPointTest {

	@InjectMocks
	private ShowingEndPoint subject;

	private static final String MOCKSTRING = "[{\"id\": 1,\"price\": \"10.00\",\"name\": \"child\"}]";

	@Mock
	private ShowingService mockService;

	@Test
	public void testAllShowingsAreReturnedCorrectly() {
		Mockito.when(mockService.getAllShowings()).thenReturn(MOCKSTRING);
		String showingString = subject.getShowingsAsJson();
		Mockito.verify(mockService).getAllShowings();
		Assert.assertEquals(MOCKSTRING, showingString);
	}
	
	@Test
	public void testShowingsIsReturnedCorrectlyBasedOnId() {
		Mockito.when(mockService.getShowingBasedOnId(1L)).thenReturn(MOCKSTRING);
		String showingString = subject.getShowingBasedOnIDAsJson(1L);
		Mockito.verify(mockService).getShowingBasedOnId(1L);
		Assert.assertEquals(MOCKSTRING, showingString);
	}

}