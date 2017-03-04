package com.qa.cinema.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.cinema.service.ShowingService;
import com.qa.cinema.service.ShowingService;



	@Path("/showing")
	public class ShowingEndPoint {

		@Inject
		private ShowingService showingService;

		@GET
		@Path("/json")
		@Produces({ "application/json" })
		public String getAllShowings() {
			return showingService.getAllShowings();
		}

		@GET
		@Path("/json/{id}")
		@Produces({ "application/json" })
		public String getShowingById(@PathParam("id") Long showingId) {
			return showingService.getShowingById(showingId);
		}
		
		@POST
		@Path("/json")
		@Produces({ "application/json" })
		public String addNewShowing(String showingJson) {
			return showingService.addNewShowing(showingJson);
		}

		@PUT
		@Path("/json/{id}")
		@Produces({ "application/json" })
		public String updateShowing(@PathParam("id") Long showingId, String showingUpdate) {
			return showingService.updateShowing(showingId, showingUpdate);
		}

		@DELETE
		@Path("/json/{id}")
		@Produces({ "application/json" })
		public String removeShowing(@PathParam("id") Long showingId) {
			return showingService.removeShowing(showingId);
		}

}