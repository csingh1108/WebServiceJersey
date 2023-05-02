package com.estore.rest;

import java.util.Date;

//import org.glassfish.jersey.servlet.ServletContainer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UserService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String registerUserWithPlainResponse() {
		String response = "[PLAIN TEXT] User registered successfully at "+new Date();
		return response;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String registerUserWithHTMLResponse() {
		String response = "<html>"
				+ "<body>"
				+ "<h3>[HTML TEXT] User registered successfully at "+new Date()+"</h3>"
				+ "</body>"
				+ "</html>";
		return response;
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String registerWithXMLResponse() {
		String response = "<?xml version='1.0' charset='UTF-8'?>"
				+ "<response>[XML TEXT] User registered successfully at "+new Date()+"<response>";
		return response;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String registerUserWithJSONResponse() {
		String response="{"
				+ "{\"response\": \"[JSON TEXT] User registered successfully at "+ new Date()+"\"}";
		return response;
	}
}
