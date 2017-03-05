
package com.qa.cinema.EndPointTests;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import com.qa.cinema.rest.SeatTypeEndPoint;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.cinema.service.SeatTypeService;
import com.qa.cinema.service.SeatTypeService;;
@RunWith(MockitoJUnitRunner.class)
public class SeatTypeEndPointTest {

	@InjectMocks
	private SeatTypeEndPoint seatType;

	private static final String MOCKSEATTYPEALL = "[{\"typeId\": 1,\"name\": \"STANDARD\",\"price\": 10}]";
	private static final String MOCKSEATTYPE = "{\"typeId\": 1,\"name\": \"STANDARD\",\"price\": 10}";

	@Mock
	private SeatTypeService seatTypeServiceMock;
	
	@Test
	public void testGetAllSeatTypes() {
		Mockito.when(seatTypeServiceMock.getAllSeatTypes()).thenReturn(MOCKSEATTYPEALL);
		String seatTypeString = seatType.getAllSeatTypes();
		Mockito.verify(seatTypeServiceMock).getAllSeatTypes();
		assertEquals(MOCKSEATTYPEALL, seatTypeString);
	}
	
	@Test
	public void testGetSeatTypeById() {
		Mockito.when(seatTypeServiceMock.getSeatTypeById(1l)).thenReturn(MOCKSEATTYPE);
		String seatTypeString = seatType.getSeatTypeById(1l);
		Mockito.verify(seatTypeServiceMock).getSeatTypeById(1l);
		assertEquals(MOCKSEATTYPE, seatTypeString);
	}
		
	@Test
	public void testAddNewSeatType() {
		Mockito.when(seatTypeServiceMock.addNewSeatType(MOCKSEATTYPE)).thenReturn(MOCKSEATTYPE);
		String seatTypeString = seatType.addNewSeatType(MOCKSEATTYPE);
		Mockito.verify(seatTypeServiceMock).addNewSeatType(MOCKSEATTYPE);
		assertEquals(MOCKSEATTYPE, seatTypeString);
	}
	
	
	@Test
	public void testRemoveSeatType() {
		Mockito.when(seatTypeServiceMock.removeSeatType(Mockito.anyLong())).thenReturn("SeatType removed successfully");
		String deleteMessage = seatType.removeSeatType(1l);
		Mockito.verify(seatTypeServiceMock).removeSeatType(1l);
		assertEquals("SeatType removed successfully", deleteMessage);
	}
	
	
	@Test
	public void testUpdateSeatType() {
		Mockito.when(seatTypeServiceMock.updateSeatType(2l, MOCKSEATTYPE)).thenReturn(MOCKSEATTYPE);
		String seatTypeString = seatType.updateSeatType(2l, MOCKSEATTYPE);
		Mockito.verify(seatTypeServiceMock).updateSeatType(2l, MOCKSEATTYPE);
		assertEquals(MOCKSEATTYPE, seatTypeString);
	}
}


