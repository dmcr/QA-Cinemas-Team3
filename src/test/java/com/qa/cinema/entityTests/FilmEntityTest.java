package com.qa.cinema.entityTests;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class FilmEntityTest {

	Film film = new Film();
		
		@Test
		public void testGetFilmId() {
			film.setFilmId(2);
			int id = film.getFilmId();
			assertEquals(2, id);
		}
		
		@Test
		public void testSetFilmId() {
			film.setFilmId(2);
			assertEquals(2, film.getFilmId());
		}
		
		@Test
		public void testGetFilmTitle() {
			film.setFilmTitle("Test");
			String title = film.getFilmTitle();
			assertEquals("", title);
		}
		
		@Test
		public void testSetFilmTitle() {
			film.setFilmTitle("Test");
			assertEquals("", film.getFilmTitle);
		}
		
		@Test
		public void testGetFilmSummary() {
			film.setFilmSummary("Test");
			String summary = film.getFilmSummary();
			assertEquals("Test", summary);
		}
		
		@Test
		public void testSetFilmSummary() {
			film.setFilmSummary("Test");
			assertEquals("Test", film.getFilmSummary());
		}
		
		@Test
		public void testGetFilmDuration() {
			film.setFilmDuration(100);
			int duration = film.getFilmDuration();
			assertEquals(100, duration);
		}
		
		@Test
		public void testSetFilmDuration() {
			film.setFilmDuration(100);
			assertEquals(100, film.getFilmDuration());
		}
		
		@Test
		public void testGetFilmGenre() {
			film.setFilmGenre("Test");
			String genre = film.getFilmGenre();
			assertEquals("Test", genre);
		}
		
		@Test
		public void testSetFilmGenre() {
			film.setFilmGenre("Test");
			assertEquals("Test", film.getFilmGenre());
		}
		
		//Certrating enum test
		
		@Test
		public void testGetFilm3D() {
			film.setFilm3D(true);
			Boolean film3D = film.getFilm3D();
			assertFalse(film3D);
		}
		
		@Test
		public void testSetFilm3D() {
			film.setFilm3D(true);
			assertTrue(film.getFilm3D);
		}
		
		@Test
		public void testGetFilmReleaseDate() {
			film.setFilmReleaseDate("01/11/11");
			Date releaseDate = film.getFilmReleaseDate();
			assertEquals("01/11/11", releaseDate);
		}
		
		@Test
		public void testSetFilmReleaseDate() {
			film.setFilmReleaseDate("01/11/11");
			assertEquals( "01/11/11", film.getFilmReleaseDate);
		}
		@Test
		public void testGetFilmDirector() {
			film.setFilmDirector("Test");
			String director = film.getFilmDirector();
			assertEquals("Test", director);
		}
		
		@Test
		public void testSetFilmDirector() {
			film.setFilmDirector("Test");
			assertEquals("Test", film.getFilmDirector());
		}
		
		@Test
		public void testGetFilmActor() {
			film.setFilmActor("Test");
			int actor = film.getFilmActor();
			assertEquals("Test", actor);
		}
		
		@Test
		public void testSetFilmActor() {
			film.setFilmActor("Test");
			assertEquals("Test", film.getFilmActor());
		}
		
}
