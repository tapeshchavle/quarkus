package com.example.resources;

import com.example.dto.UserDTO;
import io.vertx.ext.auth.User;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Path("/hello")
public class GreetingResources {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Integer> hello(){
        return Map.of("A", 1, "B", 2, "C", 3);
    }

    @Path("/user")
    @GET
    @Produces(MediaType.APPLICATION_JSON)

    public UserDTO getUserDTO(){
        return UserDTO.builder()
                .name("Tapesh")
                .age(20)
                .location("Bhopal")
                .build();
    }


}
