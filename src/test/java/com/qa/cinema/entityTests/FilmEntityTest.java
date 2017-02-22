package com.qa.cinema.entityTests;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.qa.cinema.persistence.Film;

public class FilmEntityTest {

	Film film = new Film();
		
		@Test
		public void testGetFilmId() {
			film.setFilmId(2L);
			Long id = film.getFilmId();
			assertSame(2L, id);
		}
		
		@Test
		public void testSetFilmId() {
			film.setFilmId(2L);
			assertSame(2L, film.getFilmId());
		}
		
		@Test
		public void testGetFilmTitle() {
			film.setTitle("Test");
			String title = film.getTitle();
			assertEquals("Test", title);
		}
		
		@Test
		public void testSetFilmTitle() {
			film.setTitle("Test");
			assertEquals("Test", film.getTitle());
		}
		
		@Test
		public void testGetFilmSummary() {
			film.setSummary("Test");
			String summary = film.getSummary();
			assertEquals("Test", summary);
		}
		
		@Test
		public void testSetFilmSummary() {
			film.setSummary("Test");
			assertEquals("Test", film.getSummary());
		}
		
		@Test
		public void testGetFilmDuration() {
			film.setDuration(100);
			int duration = film.getDuration();
			assertEquals(100, duration);
		}
		
		@Test
		public void testSetFilmDuration() {
			film.setDuration(100);
			assertEquals(100, film.getDuration());
		}
		
		@Test
		public void testGetFilmGenre() {
			film.setGenre("Test");
			String genre = film.getGenre();
			assertEquals("Test", genre);
		}
		
		@Test
		public void testSetFilmGenre() {
			film.setGenre("Test");
			assertEquals("Test", film.getGenre());
		}
		
		@Test
		public void testGetCertrating() {
			film.setCertification("Test");
			String cert = film.getCertification();
			assertEquals("Test", cert);
		}
		
		@Test
		public void testSetCertification() {
			film.setGenre("Test");
			assertEquals("Test", film.getGenre());
		}
	
		@Test
		public void testGetFilm3D() {
			film.setIs3D(true);
			Boolean film3D = film.getIs3D();
			assertFalse(film3D);
		}
		
		@Test
		public void testSetFilm3D() {
			film.setIs3D(true);
			assertTrue(film.getIs3D());
		}
		
		@Test
		public void testGetFilmReleaseDate() {
			film.setReleaseDate(null);
			Date releaseDate = film.getReleaseDate();
			assertEquals("01/11/11", releaseDate);
		}
		
		@Test
		public void testSetFilmReleaseDate() {
			film.setReleaseDate(null);
			assertEquals( "01/11/11", film.getReleaseDate());
		}
		@Test
		public void testGetFilmDirector() {
			film.setDirector("Test");
			String director = film.getDirector();
			assertEquals("Test", director);
		}
		
		@Test
		public void testSetFilmDirector() {
			film.setDirector("Test");
			assertEquals("Test", film.getDirector());
		}
		
		@Test
		public void testGetFilmActor() {
			film.setCast("Test");
			String cast = film.getCast();
			assertEquals("Test", cast);
		}
		
		@Test
		public void testSetFilmActor() {
			film.setCast("Test");
			assertEquals("Test", film.getCast());
		}
		
}
