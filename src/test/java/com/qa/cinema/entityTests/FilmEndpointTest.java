package com.qa.cinema.entityTests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.cinema.rest.FilmEndpoint;
import com.qa.cinema.service.FilmService;

@RunWith(MockitoJUnitRunner.class)
public class FilmEndpointTest {

	@InjectMocks
	private FilmEndpoint subject;
	
	private static final String MOCKFILM = "[{\"id\": 1,\" is3D\": \"true\", \"cast\": \"Tom Hardy\", \"certification\": \"15\", \"director\": \"James Cameron\", \"duration\": \"120 mins\", \"genre\": \"Horror\", \"releaseDate\": \"20-02-17\", \"summary\": \"One man fights to try his best to defeat the evil ghosts\", \"title\": \"Spooks\", \"showings\": []\"}]";
	
	
	@Mock
	private FilmService filmServiceMock;
	
	@Test
	public void testGetAllFilms() {
		Mockito.when(filmServiceMock.getAllFilms()).thenReturn(MOCKFILM);
		String filmString = subject.getFilmsAsJson();
		Mockito.verify(filmServiceMock).getAllFilms();
		assertEquals(MOCKFILM, filmString);
	}
	
	
	@Test
	public void testAddNewFilm() {
		Mockito.when(filmServiceMock.addNewFilm(MOCKFILM)).thenReturn(MOCKFILM);
		String filmString = subject.addNewFilm(MOCKFILM);
		Mockito.verify(filmServiceMock).addNewFilm(MOCKFILM);
		assertEquals(MOCKFILM, filmString);
	}
	
	
	@Test
	public void testRemoveFilm() {
		Mockito.when(filmServiceMock.removeFilm(Mockito.anyLong())).thenReturn("Film removed successfully");
		String deleteMessage = subject.removeFilm(1l);
		Mockito.verify(filmServiceMock).removeFilm(1l);
		assertEquals("Film removed successfully", deleteMessage);
	}
	
	
	@Test
	public void testUpdateFilm() {
		Mockito.when(filmServiceMock.updateFilm(2l, MOCKFILM)).thenReturn(MOCKFILM);
		String filmString = subject.updateFilm(2l, MOCKFILM);
		Mockito.verify(filmServiceMock).updateFilm(2l, MOCKFILM);
		assertEquals(MOCKFILM, filmString);
	}
}
