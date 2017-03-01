package com.qa.cinema.EndPointTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.cinema.rest.TicketEndPoint;
import com.qa.cinema.service.TicketService;


import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class TicketEndPointTest {
	
	@InjectMocks
	private TicketEndPoint ticketEndPoint;
	
	private static final String MOCKSTRINGALL = "[{\"tickedId\": 1,\"bookingId\": 1,\"showing\": {"
			+ "\"showingId\": 1, \"startTime\": \"Jun 17, 0018 12:10:08 PM\", \"screenId\": 1, \"filmId\": 1},\"seat\": {"
			+ "\"seatId\": 1, \"number\": 1, \"row\": \"A\", \"seatType\": { \"typeId\": 1, \"name\": \"STANDARD\", \"price\": 10}, \"screenId\": 1},"
			+ "\"ticketType\": \"ADULT\"}]";
	private static final String MOCKSTRING = "{\"tickedId\": 1,\"bookingId\": 1,\"showing\": {"
			+ "\"showingId\": 1, \"startTime\": \"Jun 17, 0018 12:10:08 PM\", \"screenId\": 1, \"filmId\": 1},\"seat\": {"
			+ "\"seatId\": 1, \"number\": 1, \"row\": \"A\", \"seatType\": { \"typeId\": 1, \"name\": \"STANDARD\", \"price\": 10}, \"screenId\": 1},"
			+ "\"ticketType\": \"ADULT\"}";
	
	@Mock
	private TicketService mockService;
	
	@Test
	public void testGetAllTicketsReturned() {
		Mockito.when(mockService.getAllTickets()).thenReturn(MOCKSTRINGALL);
		String ticketString = ticketEndPoint.getTicketsAsJson();
		Mockito.verify(mockService).getAllTickets();
		Assert.assertEquals(MOCKSTRINGALL, ticketString);
	}
	
	@Test
	public void testGetTicketByIdReturned() {
		Mockito.when(mockService.getTicketByTicketID(1L)).thenReturn(MOCKSTRING);
		String ticketString = ticketEndPoint.getTicketByTicketIDAsJson(1L);
		Mockito.verify(mockService).getTicketByTicketID(1L);
		Assert.assertEquals(MOCKSTRING, ticketString);
	}
	
}
