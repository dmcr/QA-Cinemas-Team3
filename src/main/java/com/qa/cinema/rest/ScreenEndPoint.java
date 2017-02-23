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
	@Path("/json/{screenId}")
	@Produces({"application/json"})
	public String getScreenbyIDAsJson(@PathParam("screenId") Long id) {
		return screenService.getScreentypebyId(id);
	}
}