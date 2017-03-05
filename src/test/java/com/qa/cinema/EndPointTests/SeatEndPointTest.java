
package com.qa.cinema.EndPointTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.cinema.rest.SeatEndPoint;
import com.qa.cinema.service.SeatService;



@RunWith(MockitoJUnitRunner.class)
public class SeatEndPointTest {

	@InjectMocks
	private SeatEndPoint seat;

	private static final String MOCKSEATALL = "[{\"seatId\": 1,\"number\": 1,\"row\": \"A\",\"seatType\": {"
			+ "\"typeId\": 1, \"name\": \"STANDARD\", \"price\": 10},\"screenId\": 1}]";
	
	private static final String MOCKSEAT = "{\"seatId\": 1,\"number\": 1,\"row\": \"A\",\"seatType\": {"
			+ "\"typeId\": 1, \"name\": \"STANDARD\", \"price\": 10},\"screenId\": 1}";

	@Mock
	private SeatService seatServiceMock;
	
	@Test
	public void testGetAllSeats() {
		Mockito.when(seatServiceMock.getAllSeats()).thenReturn(MOCKSEATALL);
		String seatString = seat.getAllSeats();
		Mockito.verify(seatServiceMock).getAllSeats();
		assertEquals(MOCKSEATALL, seatString);
	}
	
	@Test
	public void testGetSeatById() {
		Mockito.when(seatServiceMock.getSeatById(1l)).thenReturn(MOCKSEAT);
		String seatString = seat.getSeatById(1l);
		Mockito.verify(seatServiceMock).getSeatById(1l);
		assertEquals(MOCKSEAT, seatString);
	}
		
	@Test
	public void testAddNewSeat() {
		Mockito.when(seatServiceMock.addNewSeat(MOCKSEAT)).thenReturn(MOCKSEAT);
		String seatString = seat.addNewSeat(MOCKSEAT);
		Mockito.verify(seatServiceMock).addNewSeat(MOCKSEAT);
		assertEquals(MOCKSEAT, seatString);
	}
	
	
	@Test
	public void testRemoveSeat() {
		Mockito.when(seatServiceMock.removeSeat(Mockito.anyLong())).thenReturn("Seat removed successfully");
		String deleteMessage = seat.removeSeat(1l);
		Mockito.verify(seatServiceMock).removeSeat(1l);
		assertEquals("Seat removed successfully", deleteMessage);
	}
	
	
	@Test
	public void testUpdateSeat() {
		Mockito.when(seatServiceMock.updateSeat(2l, MOCKSEAT)).thenReturn(MOCKSEAT);
		String seatString = seat.updateSeat(2l, MOCKSEAT);
		Mockito.verify(seatServiceMock).updateSeat(2l, MOCKSEAT);
		assertEquals(MOCKSEAT, seatString);
	}

}

