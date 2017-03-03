package com.qa.cinema.EndPointTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.cinema.rest.BookingEndPoint;
import com.qa.cinema.service.BookingService;


@RunWith(MockitoJUnitRunner.class)
public class BookingEndpointTest {

	@InjectMocks
	private BookingEndPoint booking;
	
	private static final String MOCKSTRINGALL = "[{\"bookingId\": 1,\"complete\": true,\"paypal\": \"10074405\"}]";
	private static final String MOCKSTRING = "{\"bookingId\": 1,\"complete\": true,\"paypal\": \"10074405\"}";
	private static final String MOCKSTRINGNEW = "{\"bookingId\": 1,\"complete\": false,\"paypal\": }";
	
	@Mock
	private BookingService mockService;


	@Test
	public void testGetAllBookings() {
		Mockito.when(mockService.getAllBookings()).thenReturn(MOCKSTRINGALL);
		String bookingString = booking.getBookingAsJson();
		Mockito.verify(mockService).getAllBookings();
		Assert.assertEquals(MOCKSTRINGALL, bookingString);
	}

	@Test
	public void testGetBookingById() {
		Mockito.when(mockService.getBookingByID(1L)).thenReturn(MOCKSTRING);
		String bookingString = booking.getBookingAsJsonFromID(1L);
		Mockito.verify(mockService).getBookingByID(1L);
		Assert.assertEquals(MOCKSTRING, bookingString);
	}
	
	@Test
	public void testCreateNewBooking() {
		Mockito.when(mockService.createNewBooking()).thenReturn(MOCKSTRINGNEW);
		String bookingString = booking.createNewBooking();
		Mockito.verify(mockService).createNewBooking();
		Assert.assertEquals(MOCKSTRINGNEW, bookingString);
	}

}
