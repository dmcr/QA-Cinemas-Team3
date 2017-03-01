
package com.qa.cinema.EndPointTests;

import org.junit.Assert;
import com.qa.cinema.rest.SeatTypeEndPoint;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.cinema.service.SeatTypeService;;
@RunWith(MockitoJUnitRunner.class)
public class SeatTypeEndPointTest {

	@InjectMocks
	private SeatTypeEndPoint subject;

	private static final String MOCKSTRINGALL = "[{\"typeId\": 1,\"name\": \"STANDARD\",\"price\": 10}]";
	private static final String MOCKSTRING = "{\"typeId\": 1,\"name\": \"STANDARD\",\"price\": 10}";

	@Mock
	private SeatTypeService mockService;

	@Test
	public void testAllSeatTypesAreReturnedCorrectly() {
		Mockito.when(mockService.getSeatTypes()).thenReturn(MOCKSTRINGALL);
		String seatTypeString = subject.getSeatTypeAsJson();
		Mockito.verify(mockService).getSeatTypes();
		Assert.assertEquals(MOCKSTRINGALL, seatTypeString);
	}
	
	@Test
	public void testSeatTypesIsReturnedCorrectlyBasedOnId() {
		Mockito.when(mockService.getSeatTypeById(1L)).thenReturn(MOCKSTRING);
		String seatTypeString = subject.getSeatTypeAsJsonBasedOnId(1L);
		Mockito.verify(mockService).getSeatTypeById(1L);
		Assert.assertEquals(MOCKSTRING, seatTypeString);
	}

}


