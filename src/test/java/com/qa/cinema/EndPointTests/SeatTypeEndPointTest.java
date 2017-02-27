
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

	private static final String MOCKSTRING = "[{\"id\": 1,\"price\": \"10.00\",\"name\": \"child\"}]";

	@Mock
	private SeatTypeService mockService;

	@Test
	public void testAllSeatTypesAreReturnedCorrectly() {
		Mockito.when(mockService.listAllSeatTypes()).thenReturn(MOCKSTRING);
		String seatTypeString = subject.getSeatTypeAsJson();
		Mockito.verify(mockService).listAllSeatTypes();
		Assert.assertEquals(MOCKSTRING, seatTypeString);
	}
	
	@Test
	public void testSeatTypesIsReturnedCorrectlyBasedOnId() {
		Mockito.when(mockService.listSeatTypeBasedOnId(1L)).thenReturn(MOCKSTRING);
		String seatTypeString = subject.getSeatTypeAsJsonBasedOnId(1L);
		Mockito.verify(mockService).listSeatTypeBasedOnId(1L);
		Assert.assertEquals(MOCKSTRING, seatTypeString);
	}

}


