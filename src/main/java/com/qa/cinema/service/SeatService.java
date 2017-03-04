package com.qa.cinema.service;

public interface SeatService {
	
	public String getAllSeats();
	
	public String getSeatById(Long seatId);

	public String addNewSeat(String seatJson);

	public String updateSeat(Long seatId, String seatUpdate);

	public String removeSeat(Long seatId);

}
