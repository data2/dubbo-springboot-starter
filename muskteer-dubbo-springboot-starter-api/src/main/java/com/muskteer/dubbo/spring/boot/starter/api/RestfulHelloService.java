package com.muskteer.dubbo.spring.boot.starter.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/restful")
public interface RestfulHelloService {
    @GET
    @Path("/hi/{name}")
    String hi(@PathParam("name") String name);
}
