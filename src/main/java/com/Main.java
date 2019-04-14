package com;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

import controller.*;

@Path("/")
public class Main {

	@POST
	@Path("/login")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED, MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public Response login(String a) {
		
		JSONObject credJson = new JSONObject(a);
		
		String userName = credJson.getString("userName");
		String password = credJson.getString("password");
		
		
		return Response.status(200).build();
	}
}
