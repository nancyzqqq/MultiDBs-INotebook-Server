/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.sis.infsci2711.iNotebook.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Wu
 */
@Path("/hello")
public class Search {

    @GET
    @Path("{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHello(@PathParam("name") String name) {
        return name;
    }
}
