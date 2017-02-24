package com.qa.cinema.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.cinema.service.ScreenService;

@Path("/screen")
public class ScreenEndPoint {

	@Inject
	private ScreenService screenService;
	
	@GET
	@Path("/json")
	@Produces({"application/json"})
	public String getScreenAsJson() {
		return screenService.getAllScreens();
	}
	
	@GET
	@Path("/json/{id}")
	@Produces({"application/json"})
	public String getScreenbyIDAsJson(@PathParam("id") Long id) {
		return screenService.getScreentypebyId(id);
	}
}