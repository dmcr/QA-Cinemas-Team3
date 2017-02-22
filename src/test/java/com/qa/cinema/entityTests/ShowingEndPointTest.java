package com.qa.cinema.entityTests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.student.bookstore.rest.BookEndPoint;
import com.qa.student.bookstore.service.BookService;


@RunWith(MockitoJUnitRunner.class)
public class ShowingEndPointTest {


		@InjectMocks

		private static final String MOCKSTRING = "[{\"id\": 1,\"showingStartTime\": \"16:00\",\"showingFilmID\": \"1\"}]";

		@Mock
		private BookService mockService;

		@Test
		public void testGetAllShowingsAreReturnedCorrectly() {
			Mockito.when(mockService.getAllShowings()).thenReturn(MOCKSTRING);
			String showingString = subject.getShowingsAsJson();
			Mockito.verify(mockService).getAllShowings();
			Assert.assertEquals(MOCKSTRING, showingString);
		}
		
}

