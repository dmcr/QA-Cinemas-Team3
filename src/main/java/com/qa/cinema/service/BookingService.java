package com.qa.cinema.service;

public interface BookingService {
	String getAllBookings();
	String getBookingByID(Long bookingID);
	String createNewBooking();
}
