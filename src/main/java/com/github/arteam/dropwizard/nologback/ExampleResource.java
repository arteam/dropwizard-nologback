package com.github.arteam.dropwizard.nologback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.TEXT_PLAIN)
public class ExampleResource {

    private static final Logger log = LoggerFactory.getLogger(ExampleResource.class);

    @GET
    public String get(@QueryParam("name") @DefaultValue("World") String name) {
        log.info("Name parameter: %s", name);
        return String.format("Hello, %s!", name);
    }
}
