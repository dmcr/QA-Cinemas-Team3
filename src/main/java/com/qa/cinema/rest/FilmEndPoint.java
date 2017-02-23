package com.qa.cinema.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.cinema.service.SeatTypeService;

@Path("Films")
public class FilmEndPoint {

	@Inject
	private FilmService filmService;

	@GET
	@Path("json")
	@Produces({ "application/json" })
	public String getFilmAsJson() {
		return filmService.getAllFilms();

	}

	@GET
	@Path("json")
	@Produces({ "application/json" })
	public String getFilmAsJsonBasedOnId(Long id) {
		return null;
	}
	
	@POST
	@Path("/json")
	@Produces({ "application/json" })
	public String addNewBookToMap(String filmJson) {
		return filmService.addNewFilm(filmJson);
	}

	@PUT
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String replaceBookFromBookStore(@PathParam("id") Integer id, String bookJson) {
		return bookService.replaceBook(id, bookJson);
	}

	@DELETE
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String deleteBookFromBookStore(@PathParam("id") Integer id) {
		return bookService.deleteBook(id);
	}

}
