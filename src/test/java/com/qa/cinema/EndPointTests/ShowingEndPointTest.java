package com.qa.cinema.EndPointTests;

import static org.junit.Assert.assertEquals;

import com.qa.cinema.rest.ShowingEndPoint;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import com.qa.cinema.service.ShowingService;

@RunWith(MockitoJUnitRunner.class)

public class ShowingEndPointTest {

	@InjectMocks
	private ShowingEndPoint showing;

	private static final String MOCKSHOWINGALL = "[{\"showingId\": 1,\"startTime\": \"Jun 17, 0018 12:10:08 PM\",\"screenId\": 1, \"showingId\": 1}]";
	private static final String MOCKSHOWING = "{\"showingId\": 1,\"startTime\": \"Jun 17, 0018 12:10:08 PM\",\"screenId\": 1, \"showingId\": 1}";

	@Mock
	private ShowingService showingServiceMock;
	
	@Test
	public void testGetAllShowings() {
		Mockito.when(showingServiceMock.getAllShowings()).thenReturn(MOCKSHOWINGALL);
		String showingString = showing.getAllShowings();
		Mockito.verify(showingServiceMock).getAllShowings();
		assertEquals(MOCKSHOWINGALL, showingString);
	}
	
	@Test
	public void testGetShowingById() {
		Mockito.when(showingServiceMock.getShowingById(1l)).thenReturn(MOCKSHOWING);
		String showingString = showing.getShowingById(1l);
		Mockito.verify(showingServiceMock).getShowingById(1l);
		assertEquals(MOCKSHOWING, showingString);
	}
		
	@Test
	public void testAddNewShowing() {
		Mockito.when(showingServiceMock.addNewShowing(MOCKSHOWING)).thenReturn(MOCKSHOWING);
		String showingString = showing.addNewShowing(MOCKSHOWING);
		Mockito.verify(showingServiceMock).addNewShowing(MOCKSHOWING);
		assertEquals(MOCKSHOWING, showingString);
	}
	
	
	@Test
	public void testRemoveShowing() {
		Mockito.when(showingServiceMock.removeShowing(Mockito.anyLong())).thenReturn("Showing removed successfully");
		String deleteMessage = showing.removeShowing(1l);
		Mockito.verify(showingServiceMock).removeShowing(1l);
		assertEquals("Showing removed successfully", deleteMessage);
	}
	
	
	@Test
	public void testUpdateShowing() {
		Mockito.when(showingServiceMock.updateShowing(2l, MOCKSHOWING)).thenReturn(MOCKSHOWING);
		String showingString = showing.updateShowing(2l, MOCKSHOWING);
		Mockito.verify(showingServiceMock).updateShowing(2l, MOCKSHOWING);
		assertEquals(MOCKSHOWING, showingString);
	}
}