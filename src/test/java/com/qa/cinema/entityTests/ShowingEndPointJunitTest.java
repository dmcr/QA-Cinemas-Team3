package com.qa.cinema.entityTests;

import org.junit.Assert;
import com.qa.cinema.rest.ShowingEndPoint;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.cinema.service.SeatTypeService;;
@RunWith(MockitoJUnitRunner.class)
public class ShowingEndPointTest {

	@InjectMocks
	private ShowingEndPoint subject;

	private static final String MOCKSTRING = "[{\"id\": 1,\"price\": \"10.00\",\"name\": \"child\"}]";

	@Mock
	private ShowingService mockService;

	@Test
	public void testAllShowingsAreReturnedCorrectly() {
		Mockito.when(mockService.listAllShowings()).thenReturn(MOCKSTRING);
		String showingString = subject.getShowingAsJson();
		Mockito.verify(mockService).listAllShowings();
		Assert.assertEquals(MOCKSTRING, showingString);
	}
	
	@Test
	public void testShowingsIsReturnedCorrectlyBasedOnId() {
		Mockito.when(mockService.listAllShowings()).thenReturn(MOCKSTRING);
		String showingString = subject.getShowingAsJsonBasedOnId(1L);
		Mockito.verify(mockService).listShowingBasedOnId(1L);
		Assert.assertEquals(MOCKSTRING, showingString);
	}

	
}
