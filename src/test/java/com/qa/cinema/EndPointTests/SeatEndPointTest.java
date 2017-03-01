
package com.qa.cinema.EndPointTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.cinema.rest.SeatEndPoint;
import com.qa.cinema.service.DBSeatService;


@RunWith(MockitoJUnitRunner.class)
public class SeatEndPointTest {

	@InjectMocks
	private SeatEndPoint subject;

	private static final String MOCKSTRINGALL = "[{\"seatId\": 1,\"number\": 1,\"row\": \"A\",\"seatType\": {"
			+ "\"typeId\": 1, \"name\": \"STANDARD\", \"price\": 10},\"screenId\": 1}]";
	
	private static final String MOCKSTRING = "{\"seatId\": 1,\"number\": 1,\"row\": \"A\",\"seatType\": {"
			+ "\"typeId\": 1, \"name\": \"STANDARD\", \"price\": 10},\"screenId\": 1}";

	@Mock
	private DBSeatService mockService;

	@Test
	public void testGetAllSeats() {
		Mockito.when(mockService.getAllSeats()).thenReturn(MOCKSTRINGALL);
		String seatString = subject.getAllSeatAsJson();
		Mockito.verify(mockService).getAllSeats();
		Assert.assertEquals(MOCKSTRINGALL, seatString);
	}

	@Test
	public void testGetSeatById() {
		Mockito.when(mockService.getSeatById(1L)).thenReturn(MOCKSTRING);
		String seatString = subject.getSeatAsJson(1L);
		Mockito.verify(mockService).getSeatById(1L);
		Assert.assertEquals(MOCKSTRING, seatString);
	}

}

