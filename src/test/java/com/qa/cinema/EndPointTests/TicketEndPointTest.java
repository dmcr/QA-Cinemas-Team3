package com.qa.cinema.EndPointTests;

import static org.junit.Assert.assertEquals;


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
	private TicketEndPoint ticket;
	
	private static final String MOCKTICKETALL = "[{\"tickedId\": 1,\"bookingId\": 1,\"showing\": {"
			+ "\"showingId\": 1, \"startTime\": \"Jun 17, 0018 12:10:08 PM\", \"screenId\": 1, \"ticketId\": 1},\"seat\": {"
			+ "\"seatId\": 1, \"number\": 1, \"row\": \"A\", \"seatType\": { \"typeId\": 1, \"name\": \"STANDARD\", \"price\": 10}, \"screenId\": 1},"
			+ "\"ticketType\": \"ADULT\"}]";
	private static final String MOCKTICKET = "{\"tickedId\": 1,\"bookingId\": 1,\"showing\": {"
			+ "\"showingId\": 1, \"startTime\": \"Jun 17, 0018 12:10:08 PM\", \"screenId\": 1, \"ticketId\": 1},\"seat\": {"
			+ "\"seatId\": 1, \"number\": 1, \"row\": \"A\", \"seatType\": { \"typeId\": 1, \"name\": \"STANDARD\", \"price\": 10}, \"screenId\": 1},"
			+ "\"ticketType\": \"ADULT\"}";
	
	@Mock
	private TicketService ticketServiceMock;
	
	@Test
	public void testGetAllTickets() {
		Mockito.when(ticketServiceMock.getAllTickets()).thenReturn(MOCKTICKETALL);
		String ticketString = ticket.getAllTickets();
		Mockito.verify(ticketServiceMock).getAllTickets();
		assertEquals(MOCKTICKETALL, ticketString);
	}
	
	@Test
	public void testGetTicketById() {
		Mockito.when(ticketServiceMock.getTicketById(1l)).thenReturn(MOCKTICKET);
		String ticketString = ticket.getTicketById(1l);
		Mockito.verify(ticketServiceMock).getTicketById(1l);
		assertEquals(MOCKTICKET, ticketString);
	}
		
	@Test
	public void testAddNewTicket() {
		Mockito.when(ticketServiceMock.addNewTicket(MOCKTICKET)).thenReturn(MOCKTICKET);
		String ticketString = ticket.addNewTicket(MOCKTICKET);
		Mockito.verify(ticketServiceMock).addNewTicket(MOCKTICKET);
		assertEquals(MOCKTICKET, ticketString);
	}
	
	
	@Test
	public void testRemoveTicket() {
		Mockito.when(ticketServiceMock.removeTicket(Mockito.anyLong())).thenReturn("Ticket removed successfully");
		String deleteMessage = ticket.removeTicket(1l);
		Mockito.verify(ticketServiceMock).removeTicket(1l);
		assertEquals("Ticket removed successfully", deleteMessage);
	}
	
	
	@Test
	public void testUpdateTicket() {
		Mockito.when(ticketServiceMock.updateTicket(2l, MOCKTICKET)).thenReturn(MOCKTICKET);
		String ticketString = ticket.updateTicket(2l, MOCKTICKET);
		Mockito.verify(ticketServiceMock).updateTicket(2l, MOCKTICKET);
		assertEquals(MOCKTICKET, ticketString);
	}
}
