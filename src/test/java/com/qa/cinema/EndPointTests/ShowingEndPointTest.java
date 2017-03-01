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

	private static final String MOCKSTRINGALL = "[{\"showingId\": 1,\"startTime\": \"Jun 17, 0018 12:10:08 PM\",\"screenId\": 1, \"filmId\": 1}]";
	private static final String MOCKSTRING = "{\"showingId\": 1,\"startTime\": \"Jun 17, 0018 12:10:08 PM\",\"screenId\": 1, \"filmId\": 1}";

	@Mock
	private ShowingService mockService;

	@Test
	public void testAllShowingsAreReturnedCorrectly() {
		Mockito.when(mockService.getShowings()).thenReturn(MOCKSTRINGALL);
		String showingString = subject.getShowingsAsJson();
		Mockito.verify(mockService).getShowings();
		Assert.assertEquals(MOCKSTRINGALL, showingString);
	}
	
	@Test
	public void testShowingsIsReturnedCorrectlyBasedOnId() {
		Mockito.when(mockService.getShowingById(1L)).thenReturn(MOCKSTRING);
		String showingString = subject.getShowingBasedOnIDAsJson(1L);
		Mockito.verify(mockService).getShowingById(1L);
		Assert.assertEquals(MOCKSTRING, showingString);
	}

}