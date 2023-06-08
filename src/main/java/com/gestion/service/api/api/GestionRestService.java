package com.gestion.service.api.api;

import com.gestion.service.api.to.AdherentTo;
import com.gestion.service.api.to.MessageTo;
import org.springframework.web.bind.annotation.PathVariable;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/gestion")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface GestionRestService {
    @GET
    @Path("/message/{code}")
    MessageTo getMessageByCode(@PathVariable Integer code);
   @GET
    @Path("adherent/id/{id}")
    AdherentTo getAdherentById(@PathParam("id") Long id);
    @GET
    @Path("/message")
    MessageTo getMessage();
}
