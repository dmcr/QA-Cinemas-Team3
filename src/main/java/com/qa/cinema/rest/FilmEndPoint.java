package com.qa.cinema.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.cinema.service.FilmService;

@Path("/film")
public class FilmEndPoint {

	@Inject
	private FilmService filmService;

	@GET
	@Path("/json")
	@Produces({ "application/json" })
	public String getAllFilms() {
		return filmService.getAllFilms();
	}

	@GET
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String getFilmById(@PathParam("id") Long filmId) {
		return filmService.getFilmById(filmId);
	}
	
	@POST
	@Path("/json")
	@Produces({ "application/json" })
	public String addNewFilm(String filmJson) {
		return filmService.addNewFilm(filmJson);
	}

	@PUT
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String updateFilm(@PathParam("id") Long filmId, String filmUpdate) {
		return filmService.updateFilm(filmId, filmUpdate);
	}

	@DELETE
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String removeFilm(@PathParam("id") Long filmId) {
		return filmService.removeFilm(filmId);
	}

}

