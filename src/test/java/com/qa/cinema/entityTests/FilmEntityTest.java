package com.qa.cinema.entityTests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.qa.cinema.persistence.Film;
import com.qa.cinema.persistence.SeatTypeName;
import com.qa.cinema.persistence.Showing;

public class FilmEntityTest {

	Film film = new Film();
	
		@Test
		public void testFilm() {
			assertNotNull(film);
		}
		
		@Test
		public void testGetFilmId() {
			film.setFilmId(2L);
			assertSame(2L, film.getFilmId());
		}
		
		@Test
		public void testGetFilmTitle() {
			film.setTitle("Test");
			assertEquals("Test", film.getTitle());
		}
		
		@Test
		public void testGetFilmSummary() {
			film.setSummary("Test");
			assertEquals("Test", film.getSummary());
		}
		
		@Test
		public void testGetFilmDuration() {
			film.setDuration(100);
			assertEquals(100, film.getDuration());
		}
		
		@Test
		public void testGetFilmGenre() {
			film.setGenre("Test");
			assertEquals("Test", film.getGenre());
		}
		
		@Test
		public void testGetCertrating() {
			CertificationRating certRating = CertificationRating.PG;
			film.setCertification(certRating);
			assertEquals(certRating, film.getCertification());
		}
	
		@Test
		public void testGetFilm3D() {
			film.setIs3D(true);
			Boolean film3D = film.isIs3D();
			assertTrue(film3D);
		}
		
		@Test
		public void testGetFilmReleaseDate() {
			Date releaseDate = new Date(11/11/11);
			film.setReleaseDate(releaseDate);
			assertEquals(releaseDate, film.getReleaseDate());
		}
		
		@Test
		public void testGetFilmDirector() {
			film.setDirector("Test");
			assertEquals("Test", film.getDirector());
		}
		
		@Test
		public void testGetFilmActor() {
			film.setCast("Test");
			assertEquals("Test", film.getCast());
		}
		
		@Test
		public void testGetFilmShowings() {
			List<Showing> showings = new ArrayList<Showing>();
			film.setShowings(showings);
			assertEquals(showings, film.getShowings());
		}
		
		@Test 
		public void testGetIMDBID() {
			film.setIMDBID("1");
			assertEquals("1", film.getIMDBID());
		}
}
