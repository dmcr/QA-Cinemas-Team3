package com.qa.cinema.service;

public interface TicketService {
	
String getAllTickets();
	
	String getTicketById(Long ticketId);
	
	String addNewTicket(String ticketJson);
	
	String removeTicket(Long ticketId);
	
	String updateTicket(Long ticketId, String ticketUpdate);
	
}
