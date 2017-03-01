package com.qa.cinema.EndPointTests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.cinema.rest.FilmEndPoint;
import com.qa.cinema.service.FilmService;

@RunWith(MockitoJUnitRunner.class)
public class FilmEndpointTest {

	@InjectMocks
	private FilmEndPoint subject;
	
	private static final String MOCKFILMALL = "[{\"filmId\": 1,\" is3D\": \"false\", \"cast\": \"Tom Hardy\", \"certification\":"
			+ " \"PG\", \"director\": \"James Cameron\", \"duration\": \"120\", \"genre\": \"Horror\", \"releaseDate\": "
			+ "\"Jun 17, 0018\", \"summary\": \"One man fights to try his best to defeat the evil ghosts\", \"title\": "
			+ "\"Spooks\", \"showings\": [{\"showingId\": 1, \"startTime\": \"Jun 17, 0018 12:10:08 PM\", \"screenId\": "
			+ "1, \"filmId\": 1}]\"}]";
	private static final String MOCKFILM = "{\"filmId\": 1,\" is3D\": \"false\", \"cast\": \"Tom Hardy\", \"certification\":"
			+ " \"PG\", \"director\": \"James Cameron\", \"duration\": \"120\", \"genre\": \"Horror\", \"releaseDate\": "
			+ "\"Jun 17, 0018\", \"summary\": \"One man fights to try his best to defeat the evil ghosts\", \"title\": "
			+ "\"Spooks\", \"showings\": [{\"showingId\": 1, \"startTime\": \"Jun 17, 0018 12:10:08 PM\", \"screenId\": "
			+ "1, \"filmId\": 1}]\"}";
	
	
	@Mock
	private FilmService filmServiceMock;
	
	@Test
	public void testGetAllFilms() {
		Mockito.when(filmServiceMock.getAllFilms()).thenReturn(MOCKFILMALL);
		String filmString = subject.getFilmsAsJson();
		Mockito.verify(filmServiceMock).getAllFilms();
		assertEquals(MOCKFILMALL, filmString);
	}
	
	@Test
	public void testGetFilmById() {
		Mockito.when(filmServiceMock.getFilmById(1l)).thenReturn(MOCKFILM);
		String filmString = subject.getFilmAsJsonBasedOnId(1l);
		Mockito.verify(filmServiceMock).getFilmById(1l);
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
		String deleteMessage = subject.deleteFilmFromCinema(1l);
		Mockito.verify(filmServiceMock).removeFilm(1l);
		assertEquals("Film removed successfully", deleteMessage);
	}
	
	
	@Test
	public void testUpdateFilm() {
		Mockito.when(filmServiceMock.updateFilm(2l, MOCKFILM)).thenReturn(MOCKFILM);
		String filmString = subject.updateFilmInCinema(2l, MOCKFILM);
		Mockito.verify(filmServiceMock).updateFilm(2l, MOCKFILM);
		assertEquals(MOCKFILM, filmString);
	}
}
