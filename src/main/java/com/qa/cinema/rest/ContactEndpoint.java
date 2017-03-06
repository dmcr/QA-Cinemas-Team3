package com.qa.cinema.rest;
import javax.inject.Inject;
import javax.ws.rs.*;

import com.qa.cinema.service.ContactService;


@Path("/")
public class ContactEndpoint {

    @Inject
    private ContactService service;

    @Path("/#")
    @POST
    @Produces({ "application/json"})
    public String sendEmail(String email) {
    	return service.sendEmail(email);
    }
}
