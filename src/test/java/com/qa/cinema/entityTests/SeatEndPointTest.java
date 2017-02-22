package com.qa.cinema.entityTests;



import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.cinema.service.DBSeatService;



@RunWith(MockitoJUnitRunner.class)
public class SeatEndPointTest {

	@InjectMocks
	private SeatEndPoint subject;

	private static final String MOCKSTRING = "[{\"id\": 1,\"Number\": 1,\"Row\": \"A\",\"seatType\": {},\"Screen\": {}]";


	@Mock
	private DBSeatService mockService;

	@Test
	public void testGetAllSeats() {
		Mockito.when(mockService.getAllSeats()).thenReturn(MOCKSTRING);
		String seatString = subject.getSeatAsJson();
		Mockito.verify(mockService).getAllSeats();
		Assert.assertEquals(MOCKSTRING, seatString);
	}

	@Test
	public void testGetSeatById() {
		Mockito.when(mockService.getSeatById(1)).thenReturn(MOCKSTRING);
		String seatString = subject.getSeatAsJson(1, MOCKSTRING);
		Mockito.verify(mockService).getSeatById(1, MOCKSTRING);
		Assert.assertEquals(MOCKSTRING, seatString);
	}

}