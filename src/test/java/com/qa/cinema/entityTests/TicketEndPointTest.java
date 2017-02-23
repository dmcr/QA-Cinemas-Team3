package com.qa.cinema.entityTests;

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
	
	private static final String MOCKALLSTRING = "[{\"tickedId\": 1,\"booking\": {},\"showing\": {},\"seat\": {}}]";
	private static final String MOCKTICKETSSTRING = "{\"tickedId\": 1,\"booking\": {},\"showing\": {},\"seat\": {}}";
	private static final String MOCKBOOKINGTICKETSSTRING = "[{\"tickedId\": 1,\"booking\": {},\"showing\": {},\"seat\": {}}]";
	
	@Mock
	private TicketService mockService;
	
	@Test
	public void testGetAllTicketsReturned() {
		Mockito.when(mockService.getAllTickets()).thenReturn(MOCKALLSTRING);
		String ticketString = ticketEndPoint.getTicketsAsJson();
		Mockito.verify(mockService).getAllTickets();
		Assert.assertEquals(MOCKALLSTRING, ticketString);
	}
	
	@Test
	public void testGetTicketByIdReturned() {
		Mockito.when(mockService.getTicketByTicketID(1L)).thenReturn(MOCKTICKETSSTRING);
		String ticketString = ticketEndPoint.getTicketByTicketIDAsJson(1L);
		Mockito.verify(mockService).getTicketByTicketID(1L);
		Assert.assertEquals(MOCKTICKETSSTRING, ticketString);
	}
	
	@Test
	public void testGetTicketsByBookingIDReturned() {
		Mockito.when(mockService.getTicketByTicketID(1L)).thenReturn(MOCKBOOKINGTICKETSSTRING);
		String ticketString = ticketEndPoint.getTicketsByBookingTicketIDAsJson(1L);
		Mockito.verify(mockService).getAllTicketsByBookingID(1L);
		Assert.assertEquals(MOCKBOOKINGTICKETSSTRING, ticketString);
	}
}
