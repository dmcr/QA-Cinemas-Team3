package com.qa.cinema.entityTests;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.cinema.rest.BookingEndpoint;
import com.qa.cinema.service.BookingService;

@RunWith(MockitoJUnitRunner.class)
public class BookingEndpointTest {

	@InjectMocks
	private BookingEndpoint booking;
	
	private static final String MOCKSTRING = "[{\"booking_id\": 1,\"booking_complete\": \"true\",\"paypal_id\": \"10074405\"}]";
	
	@Mock
	private BookingService mockService;
	
	
	@Test
	public void testGetAllBookings() {
		Mockito.when(mockService.getAllBookings()).thenReturn(MOCKSTRING);
		String bookingString = booking.get
	}

	@Test
	public void testGetBookingByID() {
		fail("Not yet implemented");
	}

}
