package com.qa.cinema.entityTests;

import static org.junit.Assert.*;
import java.lang.reflect.Field;
import org.junit.Test;

public class BookingTest {

	// Temporary Booking class
	class Booking{
		public int getBookingID() {
			return BookingID;
		}
		public void setBookingID(int bookingID) {
			BookingID = bookingID;
		}
		public boolean getBookingComplete() {
			return BookingComplete;
		}
		public void setBookingComplete(boolean bookingComplete) {
			BookingComplete = bookingComplete;
		}
		public long getPaypalBookingID() {
			return PaypalBookingID;
		}
		public void setPaypalBookingID(long paypalBookingID) {
			PaypalBookingID = paypalBookingID;
		}
		
		public int BookingID;
		public boolean BookingComplete;
		public long PaypalBookingID;
	}
	
	@Test
	public void testGetID() throws NoSuchFieldException, IllegalAccessException {
		final Booking booking = new Booking();
		
		final Field field = booking.getClass().getDeclaredField("bookingID");
		field.setAccessible(true);
		field.set(booking, 412);
		final int Result = booking.getBookingID();
		
		assertEquals(Result, 412);
	}
	
	@Test
	public void testSetID() throws NoSuchFieldException, IllegalAccessException {
		final Booking booking = new Booking();
		
		booking.setBookingID(412);
		
		final Field field = booking.getClass().getDeclaredField("bookingID");
		field.setAccessible(true);
		assertEquals(field.get(booking), 412);
	}
	
	@Test
	public void testGetBookingComplete() throws NoSuchFieldException, IllegalAccessException {
		final Booking booking = new Booking();
		
		final Field field = booking.getClass().getDeclaredField("bookingComplete");
		field.setAccessible(true);
		field.set(booking, true);
		final Boolean Result = booking.getBookingComplete();
		
		assertEquals(Result, true);
	}
	
	@Test
	public void testSetBookingComplete() throws NoSuchFieldException, IllegalAccessException {
		final Booking booking = new Booking();
		
		booking.setBookingComplete(true);
		
		final Field field = booking.getClass().getDeclaredField("bookingComplete");
		field.setAccessible(true);
		assertEquals(field.get(booking), true);
	}
	
	@Test
	public void testGetPaypalBookingID() throws NoSuchFieldException, IllegalAccessException {
		final Booking booking = new Booking();
		
		final Field field = booking.getClass().getDeclaredField("PaypalBookingID");
		field.setAccessible(true);
		field.set(booking, 10074405);
		final long Result = booking.getPaypalBookingID();
		
		assertEquals(Result, 10074405);
	}
	
	@Test
	public void testSetPaypalBookingID() throws NoSuchFieldException, IllegalAccessException {
		final Booking booking = new Booking();
		
		booking.setPaypalBookingID(10074405);
		
		final Field field = booking.getClass().getDeclaredField("paypalBookingID");
		field.setAccessible(true);
		assertEquals(field.get(booking), 10074405);
	}
}
