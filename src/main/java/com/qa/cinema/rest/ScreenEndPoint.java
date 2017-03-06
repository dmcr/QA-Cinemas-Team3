package com.qa.cinema.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
	@Produces({ "application/json" })
	public String getAllScreens() {
		return screenService.getAllScreens();
	}

	@GET
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String getScreenById(@PathParam("id") Long screenId) {
		return screenService.getScreenById(screenId);
	}
	
	@POST
	@Path("/json")
	@Produces({ "application/json" })
	public String addNewScreen(String screenJson) {
		return screenService.addNewScreen(screenJson);
	}

	@PUT
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String updateScreen(@PathParam("id") Long screenId, String screenUpdate) {
		return screenService.updateScreen(screenId, screenUpdate);
	}

	@DELETE
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String removeScreen(@PathParam("id") Long screenId) {
		return screenService.removeScreen(screenId);
	}

}