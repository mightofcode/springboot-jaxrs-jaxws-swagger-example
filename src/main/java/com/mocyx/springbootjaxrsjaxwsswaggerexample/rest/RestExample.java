package com.mocyx.springbootjaxrsjaxwsswaggerexample.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Component
public class RestExample {
    @GET
    @Path("/apiRest")
    @Produces(MediaType.APPLICATION_JSON)
    public final Response restExample()throws Exception{
        Thread.sleep(500);
        
        return Response.status(200).type(MediaType.APPLICATION_JSON).entity("{\"data\":\"hello rest\"}").build();
    }
}
