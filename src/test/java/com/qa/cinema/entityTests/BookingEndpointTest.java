package com.qa.cinema.entityTests;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.cinema.rest.BookingEndpoint;
import com.qa.cinema.service.BookingService;
import com.qa.cinema.service.DBSeatService;

@RunWith(MockitoJUnitRunner.class)
public class BookingEndpointTest {

	@InjectMocks
	private BookingEndpoint booking;
	
	private static final String MOCKSTRING = "[{\"booking_id\": 1,\"booking_complete\": \"true\",\"paypal_id\": \"10074405\"}]";
	
	@Mock
	private BookingService mockService;


	@Test
	public void testGetAllSeats() {
		Mockito.when(mockService.getAllBookings()).thenReturn(MOCKSTRING);
		String bookingString = booking.getBookingAsJson();
		Mockito.verify(mockService).getAllBookings();
		Assert.assertEquals(MOCKSTRING, bookingString);
	}

	@Test
	public void testGetSeatById() {
		Mockito.when(mockService.getBookingByID(1)).thenReturn(MOCKSTRING);
		String bookingString = booking.getBookingAsJson(1, MOCKSTRING);
		Mockito.verify(mockService).getBookingById(1, MOCKSTRING);
		Assert.assertEquals(MOCKSTRING, bookingString);
	}

}
