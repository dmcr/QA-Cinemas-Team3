package com.qa.cinema.EndPointTests;

import static org.junit.Assert.assertEquals;

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
	
	private static final String MOCKBOOKINGALL = "[{\"bookingId\": 1,\"complete\": true,\"paypal\": \"10074405\"}]";
	private static final String MOCKBOOKING = "{\"bookingId\": 1,\"complete\": true,\"paypal\": \"10074405\"}";

	
	@Mock
	private BookingService bookingServiceMock;
	
	@Test
	public void testGetAllBookings() {
		Mockito.when(bookingServiceMock.getAllBookings()).thenReturn(MOCKBOOKINGALL);
		String bookingString = booking.getAllBookings();
		Mockito.verify(bookingServiceMock).getAllBookings();
		assertEquals(MOCKBOOKINGALL, bookingString);
	}
	
	@Test
	public void testGetBookingById() {
		Mockito.when(bookingServiceMock.getBookingById(1l)).thenReturn(MOCKBOOKING);
		String bookingString = booking.getBookingById(1l);
		Mockito.verify(bookingServiceMock).getBookingById(1l);
		assertEquals(MOCKBOOKING, bookingString);
	}
		
	@Test
	public void testAddNewBooking() {
		Mockito.when(bookingServiceMock.addNewBooking(MOCKBOOKING)).thenReturn(MOCKBOOKING);
		String bookingString = booking.addNewBooking(MOCKBOOKING);
		Mockito.verify(bookingServiceMock).addNewBooking(MOCKBOOKING);
		assertEquals(MOCKBOOKING, bookingString);
	}
	
	
	@Test
	public void testRemoveBooking() {
		Mockito.when(bookingServiceMock.removeBooking(Mockito.anyLong())).thenReturn("Booking removed successfully");
		String deleteMessage = booking.removeBooking(1l);
		Mockito.verify(bookingServiceMock).removeBooking(1l);
		assertEquals("Booking removed successfully", deleteMessage);
	}
	
	
	@Test
	public void testUpdateBooking() {
		Mockito.when(bookingServiceMock.updateBooking(2l, MOCKBOOKING)).thenReturn(MOCKBOOKING);
		String bookingString = booking.updateBooking(2l, MOCKBOOKING);
		Mockito.verify(bookingServiceMock).updateBooking(2l, MOCKBOOKING);
		assertEquals(MOCKBOOKING, bookingString);
	}

}
