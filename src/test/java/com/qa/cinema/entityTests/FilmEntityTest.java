package com.qa.cinema.entityTests;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class FilmEntityTest {

	Film film = new Film();
		
		@Test
		public void testGetFilmId() {
			int id = film.getFilmId();
			assertEquals(1, holdID);
		}
		
		@Test
		public void testSetFilmId() {
			film.setFilmId(2);
			assertEquals(2, film.getFilmId());
		}
		
		@Test
		public void testGetFilmTitle() {
			int title = film.getFilmTitle();
			assertEquals("", title);
		}
		
		@Test
		public void testSetFilmTitle() {
			film.setFilmId(2);
			assertEquals("", film.getFilmTitle);
		}
		
		@Test
		public void testGetFilmSummary() {
			int summary = film.getFilmSummary();
			assertEquals("", summary);
		}
		
		@Test
		public void testSetFilmSummary() {
			film.setFilmId(2);
			assertEquals("", film.getFilmSummary);
		}
		
		@Test
		public void testGetFilmDuration() {
			int duration = film.getFilmDuration();
			assertEquals(1, duration);
		}
		
		@Test
		public void testSetFilmDuration() {
			film.setFilmDuration(2);
			assertEquals(2, film.getFilmDuration());
		}
		
		@Test
		public void testGetFilmGenre() {
			int genre = film.getFilmGenre();
			assertEquals("", genre);
		}
		
		@Test
		public void testSetFilmGenre() {
			film.setFilmGenre(2);
			assertEquals("", film.getFilmGenre);
		}
		
		//Certrating enum test
		
		@Test
		public void testGetFilm3D() {
			int film3D = film.getFilm3D();
			assertFalse(film.getFilm3D());
		}
		
		@Test
		public void testSetFilm3D() {
			film.setFilm3D(true);
			assertTrue(film.getFilm3D);
		}
		
		@Test
		public void testGetFilmReleaseDate() {
			int releaseDate = film.getFilmReleaseDate();
			assertEquals( , film.getFilm3D());
		}
		
		@Test
		public void testSetFilmReleaseDate() {
			film.setFilmReleaseDate(true);
			assertEquals( , film.getFilmReleaseDate);
		}
		@Test
		public void testGetFilmTitle() {
			int director = film.getFilmDirector();
			assertEquals("", director);
		}
		
		@Test
		public void testSetFilmDirector() {
			film.setFilmDirector(2);
			assertEquals("", film.getFilmDirector);
		}
		
		@Test
		public void testGetFilmDirector() {
			film.setFilmActor("Test");
			int actor = film.getFilmActor();
			assertEquals("Test", title);
		}
		
		@Test
		public void testSetFilmActor() {
			film.setFilmActor("Test");
			assertEquals("Test", film.getFilmActor);
		}
		
}
