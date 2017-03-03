package com.qa.cinema.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.cinema.service.ShowingService;



	@Path("/showing")
	public class ShowingEndPoint {

		@Inject
		private ShowingService showingService;

		@GET
		@Path("/json")
		@Produces({ "application/json" })
		public String getShowingsAsJson() {
			return showingService.getShowings();
		}
		
		@GET
		@Path("/json/{id}")
		@Produces({ "application/json" })
			public String getShowingBasedOnIDAsJson(@PathParam("id") Long id) {
				return showingService.getShowingById(id);
			}


}