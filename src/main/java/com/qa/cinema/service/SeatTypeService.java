package com.qa.cinema.service;

public interface SeatTypeService {

String getAllSeatTypes();
	
	String getSeatTypeById(Long seatTypeId);
	
	String addNewSeatType(String seatTypeJson);
	
	String removeSeatType(Long seatTypeId);
	
	String updateSeatType(Long seatTypeId, String seatTypeUpdate);
	
}
