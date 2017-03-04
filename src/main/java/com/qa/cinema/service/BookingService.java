package com.qa.cinema.service;

public interface BookingService {
String getAllBookings();
	
	String getBookingById(Long bookingId);
	
	String addNewBooking(String bookingJson);
	
	String removeBooking(Long bookingId);
	
	String updateBooking(Long bookingId, String bookingUpdate);
	
}
